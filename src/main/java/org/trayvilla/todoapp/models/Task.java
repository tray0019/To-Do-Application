/**
 * @author: Rustom Trayvilla
 * @since : Aug 07, 2025
 * @version: 1.0
 * @description: Task is a model class for my to-do app. It has id, title and completed field.
 */

package org.trayvilla.todoapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean completed;

}
