package com.project.lify.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keepbang
 */
@RestController
public class HealthCheckController {

    @GetMapping("/api/ping")
    public String pint(){
        return "ok";
    }
}
