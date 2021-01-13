package main


import (
	"fmt"
	"github.com/benmanns/goworker"
)

func myFunc(queue string, args ...interface{}) error {
	fmt.Printf("[MyClass]From %s, %v\n", queue, args)
	return nil
}
func yourFunc(queue string, args ...interface{}) error {
	fmt.Printf("[YourClass]From %s, %v\n", queue, args)
	return nil
}






func init() {
	settings := goworker.WorkerSettings{
		URI:            "redis://localhost:6379",
		Connections:    100,
		Queues:         []string{"myqueue", "delimited", "queues"},
		UseNumber:      true,
		ExitOnComplete: false,
		Concurrency:    2,
		Namespace:      "resque:",
		Interval:       5.0,
	}
	goworker.SetSettings(settings)
	goworker.Register("MyClass", myFunc)
	goworker.Register("YourClass",yourFunc)
}

func main() {
	if err := goworker.Work(); err != nil {
		fmt.Println("Error:", err)
	}
}