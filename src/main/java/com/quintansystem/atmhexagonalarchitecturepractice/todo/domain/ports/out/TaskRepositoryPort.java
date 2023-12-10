package com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
