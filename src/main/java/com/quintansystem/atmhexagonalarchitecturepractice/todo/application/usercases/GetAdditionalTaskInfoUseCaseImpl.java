package com.quintansystem.atmhexagonalarchitecturepractice.todo.application.usercases;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.AdditionalTaskInfo;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out.ExternalServicePort;
import lombok.AllArgsConstructor;



@AllArgsConstructor
public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;
    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return null;
    }
}
