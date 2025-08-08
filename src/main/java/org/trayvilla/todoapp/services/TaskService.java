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

    /**
     * @return all tasks from database
     */
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /**
     * Method to save task Title and Completed to the database.
     * @param title
     */
    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }
}
