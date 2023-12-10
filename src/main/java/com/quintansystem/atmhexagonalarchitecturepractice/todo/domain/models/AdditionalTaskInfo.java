package com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AdditionalTaskInfo {
    private final Long taskId;
    private final String userName;
    private final String userEmail;
}
