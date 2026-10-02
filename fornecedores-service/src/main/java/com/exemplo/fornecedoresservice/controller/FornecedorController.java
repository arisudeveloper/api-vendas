package com.exemplo.fornecedoresservice.controller;

import com.exemplo.fornecedoresservice.service.FornecedorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class FornecedorController {

    private final FornecedorService service;

    public FornecedorController(FornecedorService service) {
        this.service = service;
    }

    @GetMapping
    public List<com.exemplo.fornecedoresservice.model.Fornecedor> listarTodos() {
        return service.listarTodos();
    }
}
