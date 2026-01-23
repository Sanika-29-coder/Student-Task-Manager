package com.student.taskmanager.controller;

import com.student.taskmanager.model.Task;
import com.student.taskmanager.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    // Constructor Injection
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

   
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    // ✅ Get Tasks By Status (PENDING / COMPLETED)
    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable String status) {
        return taskService.getTasksByStatus(status);
    }

    // ✅ Get Tasks By Priority (LOW / MEDIUM / HIGH)
    @GetMapping("/priority/{priority}")
    public List<Task> getTasksByPriority(@PathVariable String priority) {
        return taskService.getTasksByPriority(priority);
    }

    // 🔔 Get Overdue Tasks
    @GetMapping("/overdue")
    public List<Task> getOverdueTasks() {
        return taskService.getOverdueTasks();
    }
}
