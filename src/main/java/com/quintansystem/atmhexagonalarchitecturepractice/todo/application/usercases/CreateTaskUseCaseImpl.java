package com.quintansystem.atmhexagonalarchitecturepractice.todo.application.usercases;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.Task;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in.CreateTaskUseCase;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;
    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
