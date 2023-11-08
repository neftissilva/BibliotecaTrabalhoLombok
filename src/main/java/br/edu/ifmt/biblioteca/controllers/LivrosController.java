package br.edu.ifmt.biblioteca.controllers;

import br.edu.ifmt.biblioteca.entities.Livro;
import br.edu.ifmt.biblioteca.services.LivrosService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/livros")
public class LivrosController {

    private final LivrosService livrosService;

    public LivrosController(LivrosService livrosService) {
        this.livrosService = livrosService;
    }

    @PostMapping
    public ResponseEntity<Livro> criar(@RequestBody @Valid Livro novoLivro) {
        Livro livro = livrosService.criarLivro(novoLivro);
        return ResponseEntity.status(201).body(novoLivro);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> listar() {
        List<Livro> listaLivros = livrosService.listarLivros();
        return ResponseEntity.status(200).body(listaLivros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscar(@PathVariable String id) {
        Livro livro = livrosService.buscarLivro(id);
        return ResponseEntity.status(200).body(livro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> editar(@PathVariable String id, @RequestBody Livro livroEditado) {
        Livro livroSelecionado = livrosService.editarLivro(id, livroEditado);
        return ResponseEntity.status(200).body(livroSelecionado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable String id) {
        livrosService.excluirLivro(id);
        return ResponseEntity.status(204).build();
    }

}
