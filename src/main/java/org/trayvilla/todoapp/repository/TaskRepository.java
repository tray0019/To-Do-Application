package org.trayvilla.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trayvilla.todoapp.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
