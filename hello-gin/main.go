package main

import (
	"github.com/gin-gonic/gin"
)

func main() {
	router := gin.Default()
	router.GET("helloworld",helloWorld)
	router.Run(":8086")
}
