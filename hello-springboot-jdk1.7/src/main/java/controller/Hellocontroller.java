package controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Hellocontroller {
    private static final Logger logger = LogManager.getLogger(Hellocontroller.class);

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello "+name;
    }
}