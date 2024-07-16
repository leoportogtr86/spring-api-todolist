package com.porto.todolistapi.controller;

import com.porto.todolistapi.model.Tarefa;
import com.porto.todolistapi.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {
    private final TarefaService tarefaService;

    @Autowired
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa) {
        Tarefa novaTarefa = tarefaService.salvarTarefa(tarefa);

        return ResponseEntity.status(HttpStatus.CREATED).body(novaTarefa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> findTarefaById(@PathVariable Long id) {
        Tarefa tarefa = tarefaService.getTarefaById(id);

        return ResponseEntity.ok(tarefa);
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> findTarefas() {
        List<Tarefa> tarefas = tarefaService.getAllTarefas();

        return ResponseEntity.ok(tarefas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaDetalhes) {
        Tarefa tarefaAtualizada = tarefaService.updateTarefa(id, tarefaDetalhes);

        return ResponseEntity.ok(tarefaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarefa(@PathVariable Long id) {
        tarefaService.deleteTarefa(id);

        return ResponseEntity.noContent().build();
    }
}
