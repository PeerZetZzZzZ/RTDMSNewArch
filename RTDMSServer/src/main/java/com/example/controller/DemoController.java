package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @RequestMapping(value = "/api/getMessages", produces = "application/json")
    public List<HmgMessage> getMessages() {
        System.out.println("Strelam dostalem jebca");
        return Arrays.asList(new HmgMessage("service", "superRtdms", Boolean.FALSE));
    }
}
