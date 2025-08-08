package org.trayvilla.todoapp.services;

import org.springframework.stereotype.Service;
import org.trayvilla.todoapp.models.Task;
import org.trayvilla.todoapp.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
