package com.quintansystem.atmhexagonalarchitecturepractice.todo.application.usercases;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.Task;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in.UpdateTaskUseCase;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;
    @Override
    public Optional<Task> updateTask(Long id, Task task) {
        task.setId(id);
        return taskRepositoryPort.update(task);
    }
}
