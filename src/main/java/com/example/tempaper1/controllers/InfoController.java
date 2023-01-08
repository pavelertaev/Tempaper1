package com.example.tempaper1.controllers;


import com.example.tempaper1.record.InfoRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {


    @GetMapping
    public String shop() {
        return "Интернет магазин запущен";
    }

    @GetMapping("/info")
    public InfoRecord info() {
        return new InfoRecord("Ертаев Павел ", "Интернет магазин по продаже носков");
    }
}