package com.felipe.tarefas.apiresource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.tarefas.model.entity.Tarefa;
import com.felipe.tarefas.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaResource {

    @Autowired
    private TarefaService service;

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa){
        return service.salvar(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar(){
        return service.listar();
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa){
        return service.atualizar(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}