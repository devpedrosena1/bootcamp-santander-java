package br.com.dio.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // privacy, data type and attributes
    private List<Tarefa> tarefaList;

    // constructor full
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // method add task
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // method remove task
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // method get total number of task
    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }

    // method get description of task
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    // main
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println(listaTarefa.obterNumeroTotalDeTarefas());

    }
}
