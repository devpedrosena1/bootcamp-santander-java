package me.dio.domain.service;

import me.dio.domain.model.Task;
import me.dio.domain.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    // depois podemos criar uma interface e implementar os metodos aqui

    private final TaskRepository  taskRepository;

    // inject dependency with constructor
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> listarTodas() {
        return this.taskRepository.findAll();
    }

    public Task criarTarefa(Task task) {
        return this.taskRepository.save(task);
    }

    public List<Task> buscarPorStatus(String status) {
        return this.taskRepository.findByStatus(status);
    }

    public void deletarTask(Integer id) {
        taskRepository.deleteById(id);
    }

    public Task atualizarTarefa(Task task){
        return this.taskRepository.save(task); // se ja houver o id no banco, ele faz o update, se não, insert
    }

}
