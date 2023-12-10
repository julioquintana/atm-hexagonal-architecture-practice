package com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.ports.out;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);

}
