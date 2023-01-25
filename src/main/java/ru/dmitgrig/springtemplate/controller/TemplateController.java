package ru.dmitgrig.springtemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @GetMapping("/template")
    public String template() {
        return "Привет шаблон";
    }

}
