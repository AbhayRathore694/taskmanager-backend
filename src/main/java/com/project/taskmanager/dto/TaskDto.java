package com.project.taskmanager.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class TaskDto {
    private String title;
    private String description;
    private String status;
    private LocalDate dueDate;
}
