package me.dio.domain.controller;

import me.dio.domain.model.Task;
import me.dio.domain.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    // inject dependency with constructor
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/listar-task")
    public List<Task> listar() {
        return taskService.listarTodas();
    }

    @PostMapping("/criar-task")
    public Task criar(Task task) {
        return taskService.criarTarefa(task);
    }

    @GetMapping("/buscar-por-status")
    public List<Task> buscarPorStatus(String status) {
        return taskService.buscarPorStatus(status);
    }

    @DeleteMapping("/deletar-task")
    public void deletar(Integer id) {
        taskService.deletarTask(id);
    }

    @PutMapping("/atualizar-task")
    public Task atualizar(Task task) {
         return taskService.atualizarTarefa(task);
    }

}
