package com.example.natsumi.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Natsumi {
    @RequestMapping('/')
    def show(){
        new NatsumiOne(name: 'Natsumi')
    }
    class NatsumiOne {
        String name
    }
}
