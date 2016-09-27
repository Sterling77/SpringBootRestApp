package springRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Letricia on 8/8/16.
 */
@RestController
public class JsonRestController {
    @RequestMapping("/")
    public String index() {
        return "<h1>Greetings from Spring Boot!</h1>";
    }

    @RequestMapping("/test")
    public String test() {

        return "<h1>This is a test...</h1>";
    }
}
