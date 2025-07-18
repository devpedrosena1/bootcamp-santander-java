package me.dio.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "tab_task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    @Column(name = "data_criacao", updatable = false)
    private LocalDate dataCriacao;

    private String status; // pendente, em andamento, concluida

    private String prioridade; // alta, media, baixa

    public Task() {
        super();
    }

    public Task(Long id, String titulo, String descricao, LocalDate dataCriacao, String status, String prioridade) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.status = status;
        this.prioridade = prioridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    @PrePersist
    public void prePersist(){
        this.dataCriacao = LocalDate.now();
    }
}
