package com.rcm.info.api_security.controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    @GetMapping
    public ResponseEntity<String> saudacao(){
        return ResponseEntity.ok("Sejá Bem vindo");
    }
}
