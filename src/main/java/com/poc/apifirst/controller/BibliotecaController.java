package com.poc.apifirst.controller;

import com.poc.apifirst.api.BibliotecaApi;
import com.poc.apifirst.models.Livro;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BibliotecaController implements BibliotecaApi {
    @Override
    public ResponseEntity<List<Livro>> getTodosOsLivrosBiblioteca() {

        List<Livro> livros = new ArrayList<>();

        Livro l1 = new Livro();
        l1.nome("Pitanga e Eu");
        l1.author("Fulaninho");

        Livro l2 = new Livro();
        l2.nome("Como criar crises na cabeça.");
        l2.author("Beltraninho");

        livros.add(l1);
        livros.add(l2);

        return new ResponseEntity<>(livros, HttpStatus.OK);
    }
}
