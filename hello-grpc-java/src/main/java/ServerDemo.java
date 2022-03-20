import io.grpc.ServerBuilder;

import java.io.IOException;
import java.lang.annotation.Annotation;

import grpc.*;
import io.grpc.stub.StreamObserver;


public class ServerDemo {
    private void start() throws IOException{
        int port = 9999;

//        ServerBuilder.forPort(port).addService();
    }

    static class HelloImpl extends HelloGrpc.HelloImplBase {

        // proto文件中的sayHello服务接口被编译后，在生成的HelloGrpc的抽象内部类HelloImplBase中有一个简单的实现
        // 因此，在server端需要重写这个方法，添加上相应的逻辑
        @Override
        public void sayHello(HelloMessage.HelloRequest req, StreamObserver<HelloMessage.HelloResponse> responseObserver) {

            HelloMessage.HelloResponse reply = HelloMessage.HelloResponse.newBuilder().setMessage("(server端的sayHello()方法处理结果) Hello," + req.getName()).build();

            // 调用onNext()方法来通知gRPC框架把reply 从server端 发送回 client端
            responseObserver.onNext(reply);

            // 表示完成调用
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) {
        //grpc服务端实现类的特征为：父类实现了io.grpc.BindableService接口
        for(Class<?> c :HelloImpl.class.getSuperclass().getInterfaces()){
            System.out.println(c.getName());
        }
    }
}
