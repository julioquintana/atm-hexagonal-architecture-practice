package com.quintansystem.atmhexagonalarchitecturepractice.todo.domain.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationAt;
    private boolean completed;
}
