package com.example.demo.service;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-hi")
public interface HiService {

    @GetMapping("/hi")
    String sayHi(@RequestParam("name") String name);
}
