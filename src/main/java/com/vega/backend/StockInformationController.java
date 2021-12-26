package com.vega.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockInformationController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
