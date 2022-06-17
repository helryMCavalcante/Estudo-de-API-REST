package com.estudoDeApi.estudoDeApi.controller;


import com.estudoDeApi.estudoDeApi.model.UsuarioModel;
import com.estudoDeApi.estudoDeApi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") int codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }
    @PostMapping
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }
}
