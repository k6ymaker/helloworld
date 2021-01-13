package main

import (
	"context"
	"google.golang.org/grpc"
	"google.golang.org/grpc/reflection"
	"hello-grpc/protocolbuffer"
	"log"
	"net"
)

type SayHiServer struct {

}

func (s *SayHiServer) Hello(ctx context.Context,request *helloworld.Request)(*helloworld.Response,error){
	log.Printf("recive %v",request)
	return &helloworld.Response{
		Code:"666",
	},nil
}


func main(){
	lis,err := net.Listen("tcp","127.0.0.1:12000")
	if err != nil{
		log.Fatal(err)
	}

	s:= grpc.NewServer()

	reflection.Register(s)

	helloworld.RegisterSayHiServer(s,&SayHiServer{})

	s.Serve(lis)
}
