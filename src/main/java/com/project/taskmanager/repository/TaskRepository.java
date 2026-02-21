package com.project.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.taskmanager.entity.Task;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
}
