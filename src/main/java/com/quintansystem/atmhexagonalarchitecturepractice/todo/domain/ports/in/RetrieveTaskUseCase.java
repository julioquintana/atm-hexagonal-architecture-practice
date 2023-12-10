package com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> findByIdTask(Long id);
    List<Task> getAllTask();
}
