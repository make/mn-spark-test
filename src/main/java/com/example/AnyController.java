package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/any")
public class AnyController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}