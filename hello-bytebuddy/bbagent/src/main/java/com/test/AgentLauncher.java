package com.test;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.implementation.bind.annotation.Morph;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.matcher.StringMatcher;
import net.bytebuddy.utility.JavaModule;

import java.lang.instrument.Instrumentation;

import static net.bytebuddy.matcher.ElementMatchers.*;

public class AgentLauncher {
    public static void premain(String args, Instrumentation in    AgentBuilder.Transformer transformer1 = (builder, typeDescription, classLoader, module) -> builder.method(
            ElementMatchers.named("a")
            ).intercept((MethodDelegation.to(AdviceInterceptor.class)));st) {
      //试验一下的AgentBuilder默认，是否可以修改Jre中的类



//        AgentBuilder.Transformer transformer1 = (builder, typeDescription, classLoader, module) -> builder.visit(
//                Advice.to(Interceptor.class).
//                        on(
//                                ElementMatchers.named("b")
//                        )
//        );

//    AgentBuilder.Transformer transformer = new AgentBuilder.Transformer() {
//        @Override
//        public DynamicType.Builder transform(DynamicType.Builder builder,
//                                             TypeDescription typeDescription,
//                                             ClassLoader classloader) {
//            return builder.method(named("toString"))
//                    .intercept(FixedValue.value("transformed"));
//        }
//    };

    System.out.println("premain running!");

    new AgentBuilder.Default()
        .disableClassFormatChanges()
        .ignore(new AgentBuilder.RawMatcher.ForElementMatchers(nameStartsWith("net.bytebuddy.")))
        .with(AgentBuilder.InitializationStrategy.NoOp.INSTANCE)
        .with(AgentBuilder.RedefinitionStrategy.REDEFINITION)
        .with(AgentBuilder.TypeStrategy.Default.REDEFINE)
        .type(ElementMatchers.named("com.test.A"))
        .transform(transformer1)
        .installOn(inst);
//        new AgentBuilder.Transformer() {
//            @Override
//            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule) {
//                return builder.method(named("a")).intercept(FixedValue.value("hello,world!"));
//                Advice
//            }
//        }
    }
}
