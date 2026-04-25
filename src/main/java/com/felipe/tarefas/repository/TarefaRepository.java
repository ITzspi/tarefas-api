package com.felipe.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.tarefas.model.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}