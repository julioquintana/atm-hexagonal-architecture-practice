package com.quintansystem.atmhexagonalarchitecturepractice.todo.infrastructure.configs;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.application.services.TaskService;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.application.usercases.*;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out.ExternalServicePort;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out.TaskRepositoryPort;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.infrastructure.adapters.ExternalServiceAdapter;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase){
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
