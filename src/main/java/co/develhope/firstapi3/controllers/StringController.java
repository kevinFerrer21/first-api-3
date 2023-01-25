package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    
    @RequestMapping("/strings")
    public String StringInfo(@RequestParam(required = true) String s1, @RequestParam(required = false) String s2) {
        if (s2 == null) {
            return s1;
        }
        return s1+s2;
    }
}




