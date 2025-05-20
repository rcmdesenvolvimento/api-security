package com.rcm.info.api_security.controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/cliente")
public class ClienteController {

    @GetMapping
    public ResponseEntity<String> saudacao(){
        return ResponseEntity.ok("Cliente Get");
    }
}
