package com.quintansystem.atmhexagonalarchitecturepractice.todo.application.usercases;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in.DeleteTaskUseCase;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;
    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
