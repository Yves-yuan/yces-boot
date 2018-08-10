package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {
    @RequestMapping("/Hi")
    public String sayHi() {
        return "fuck you yo111.";
    }
}
