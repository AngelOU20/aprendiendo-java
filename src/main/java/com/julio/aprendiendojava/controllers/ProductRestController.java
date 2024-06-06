package com.julio.aprendiendojava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController
@RequestMapping("/api")
public class ProductRestController {

    //@ResponseBody
    //@RequestMapping(path="/products", method=RequestMethod.GET) -> Works in
    // the same way as GetMapping
    @GetMapping("/product")
    public Map<String, Object> getProduct() {
        Map<String, Object> resp = new HashMap<>();

        resp.put("title","Table");
        resp.put("description","Table Samsung s9 +");
        resp.put("price","$280");

        return resp;
    }
}
