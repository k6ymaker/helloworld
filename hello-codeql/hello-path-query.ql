
/**
 * @name hello-path-query
 * @description 在codeql中path query是data flow的一种，抽象出来描述source->sink的问题，比data flow多了non-value-preserving steps
 * @reference 参考文档：https://codeql.github.com/docs/writing-codeql-queries/creating-path-queries/
 * @kind path-problem
 */
 
import java
import semmle.code.java.dataflow.DataFlow
import semmle.code.java.dataflow.FlowSources
import DataFlow::PathGraph //path-problem 必须要依赖的包


class SinkMethod extends Callable{
    SinkMethod(){
        this.hasQualifiedName("com.test.taint", "Sink", "sink")
    }
}

class SinkMethodAccess extends MethodAccess{
    SinkMethodAccess(){
        this.getCallee() instanceof SinkMethod
    }
}

class HelloConfiguration extends  TaintTracking::Configuration{
    HelloConfiguration(){
        this = ""
    }

    override predicate isSource(DataFlow::Node source) {
        source instanceof RemoteFlowSource
    }
    
    override predicate isSink(DataFlow::Node sink) {
        exists(SinkMethodAccess sinkMethodAccess | sinkMethodAccess.getAnArgument() = sink.asExpr())
    }
}

from HelloConfiguration conf, DataFlow::PathNode source, DataFlow::PathNode sink
where conf.hasFlowPath(source, sink)
select sink.getNode(), source, sink,"test" //必须是这四列，具体含义参考文档里的select clause