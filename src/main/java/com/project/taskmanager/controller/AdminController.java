package com.project.taskmanager.controller;

import com.project.taskmanager.entity.Task;
import com.project.taskmanager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    private final TaskRepository taskRepository;

    @GetMapping("/all-tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}