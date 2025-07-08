package br.com.dio.list.operacoesBasicas;

public class Tarefa {

    // privacy, data type and attributes
    private String descricao;

    // constructor empty
    public Tarefa() {
        super();
    }

    // constructor full
    public Tarefa(String descricao) {
        super();
        this.descricao = descricao;
    }

    // method getters (return)
    public String getDescricao() {
        return descricao;
    }

    // toString
    @Override
    public String toString() {
        return "=== Tarefa ===" +
                "\nDescrição: " + descricao;
    }
}
