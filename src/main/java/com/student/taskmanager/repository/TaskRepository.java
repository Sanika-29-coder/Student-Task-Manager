package com.student.taskmanager.repository;

import com.student.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Get tasks by status (PENDING / COMPLETED)
    List<Task> findByStatus(String status);

    // Get tasks by priority (LOW / MEDIUM / HIGH)
    List<Task> findByPriority(String priority);

    // Get overdue tasks (due date before today)
    List<Task> findByDueDateBefore(LocalDate date);
}
