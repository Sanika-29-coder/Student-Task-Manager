package com.student.taskmanager.service;

import com.student.taskmanager.model.Task;
import com.student.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    // Constructor Injection
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Create Task
    public Task createTask(Task task) {
        task.setStatus("PENDING"); // default status
        return taskRepository.save(task);
    }

    // Get All Tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get Task By ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Update Task
    public Task updateTask(Long id, Task updatedTask) {
        updatedTask.setId(id);
        return taskRepository.save(updatedTask);
    }

    // Delete Task
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    // Get Tasks By Status
    public List<Task> getTasksByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

    // Get Tasks By Priority
    public List<Task> getTasksByPriority(String priority) {
        return taskRepository.findByPriority(priority);
    }

    // 🔔 Get Overdue Tasks (Due date before today)
    public List<Task> getOverdueTasks() {
        return taskRepository.findByDueDateBefore(LocalDate.now());
    }
}
