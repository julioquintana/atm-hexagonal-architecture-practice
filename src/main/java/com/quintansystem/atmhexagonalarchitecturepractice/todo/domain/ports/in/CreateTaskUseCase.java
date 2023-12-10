package com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
