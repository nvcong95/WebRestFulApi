package com.example.webrestfulapi.edu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/address")

public class AddressController {
    @RequestMapping(value = "/connection", method = RequestMethod.GET)
    public String isConnect(){
        return "Connection!";
    }

}
