package main

import (
	"context"
	"google.golang.org/grpc"
	"hello-grpc/protocolbuffer"
	"log"
)

func main(){
	conn,err := grpc.Dial("127.0.0.1:12000",grpc.WithBlock(),grpc.WithInsecure())
	if err!= nil{
		log.Fatal(err)
	}

	client := helloworld.NewSayHiClient(conn)

	reps,err := client.Hello(context.TODO(),&helloworld.Request{
		Name:"k6ymaker",
	})
	if err!= nil{
		log.Fatal(err)
	}

	log.Printf("%v",reps)
}
