package com.example.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanfanjiaming_v
 */
@RestController
@RequestMapping(value = "hello")
@Api(value = "hello-value", description = "hello-escription", tags = "hello-tags")
public class HelloController {
    @GetMapping(value = "world")
    @ApiOperation(value = "world", notes = "world")
    private String world() {
        return "Hello World";
    }
}
