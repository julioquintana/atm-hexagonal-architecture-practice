package com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.in;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
