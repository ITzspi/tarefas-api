package com.felipe.tarefas.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.tarefas.model.entity.Tarefa;
import com.felipe.tarefas.repository.TarefaRepository;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public Tarefa salvar(Tarefa tarefa){
        tarefa.setDataCriacao(LocalDateTime.now());
        tarefa.setStatus("PENDENTE");
        return repository.save(tarefa);
    }

    public List<Tarefa> listar(){
        return repository.findAll();
    }

    public Tarefa atualizar(Long id, Tarefa tarefa){
        Tarefa existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));

        existente.setNome(tarefa.getNome());
        existente.setDescricao(tarefa.getDescricao());
        existente.setStatus(tarefa.getStatus());
        existente.setObservacoes(tarefa.getObservacoes());
        existente.setDataAtualizacao(LocalDateTime.now());

        return repository.save(existente);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}