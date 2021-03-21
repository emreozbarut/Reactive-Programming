package com.reactive.programming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ExampleController {

    @GetMapping("examples")
    public Flux<String> getExamples() {
        return Flux.just("Yasin", " ", "Emre", " ", "ÖZBARUT");
    }
}
