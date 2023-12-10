package com.quintansystem.atmhexagonalarchitecturepractice.todo.application.usercases;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.Task;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in.RetrieveTaskUseCase;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;


    @Override
    public Optional<Task> findByIdTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepositoryPort.findAll();
    }
}
