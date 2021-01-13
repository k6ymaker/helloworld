package main

import "github.com/benmanns/goworker"

func main(){
	goworker.SetSettings(goworker.WorkerSettings{

	})
	goworker.Enqueue(&goworker.Job{
		Queue: "myqueue",
		Payload: goworker.Payload{
			Class: "MyClass",
			Args: []interface{}{"hi", "there"},
		},
	})
}