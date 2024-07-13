package com.porto.todolistapi.service;

import com.porto.todolistapi.exception.ResourceNotFoundException;
import com.porto.todolistapi.model.Tarefa;
import com.porto.todolistapi.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    @Autowired
    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa salvarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> getAllTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa getTarefaById(Long id) {
        Optional<Tarefa> tarefaOptional = tarefaRepository.findById(id);

        if (tarefaOptional.isPresent()) {
            return tarefaOptional.get();
        } else {
            throw new ResourceNotFoundException("Tarefa não encontrada");
        }
    }

    public Tarefa updateTarefa(Long id, Tarefa tarefaInfo) {
        Tarefa tarefa = getTarefaById(id);

        tarefa.setTitulo(tarefaInfo.getTitulo());
        tarefa.setDescricao(tarefaInfo.getDescricao());
        tarefa.setConcluido(tarefaInfo.isConcluido());

        return tarefaRepository.save(tarefa);
    }

    public void deleteTarefa(Long id) {
        Tarefa tarefa = getTarefaById(id);

        tarefaRepository.delete(tarefa);
    }
}
