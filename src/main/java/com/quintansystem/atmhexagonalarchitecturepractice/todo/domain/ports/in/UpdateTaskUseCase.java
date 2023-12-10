package com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
