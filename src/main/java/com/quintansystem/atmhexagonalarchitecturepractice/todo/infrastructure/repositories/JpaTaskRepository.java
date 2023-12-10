package com.quintansystem.atmhexagonalarchitecturepractice.todo.infrastructure.repositories;

import com.quintansystem.atmhexagonalarchitecturepractice.todo.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
