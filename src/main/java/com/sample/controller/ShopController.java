package com.sample.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class ShopController {

    @RequestMapping("/alive")
    public String rUAlive(){
        return "Yes I am Alive";
    }

    @GetMapping(value="/products/{id}")
    public String getProducts(@PathVariable(name ="id",required = false) String pid, @RequestParam(name="price",required = false) String cost){
        return "Id is "+pid+", cost:"+cost;
    }


}
