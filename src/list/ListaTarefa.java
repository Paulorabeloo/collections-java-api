package list;

import java.util.ArrayList;
import java.util.List;

// vai gerenciar uma lista de tarefas
public class ListaTarefa
{
    //atributo
    private List<Tarefa> tarefaList; //armazena uma lista de objetos do tipo tarefa

    public ListaTarefa() // construtor
    {
        this.tarefaList = new ArrayList<>();
    }

    //metodos:

    //metodo de adicionartarefa 
    public void adicionarTarefa(String descricao)
    {
        tarefaList.add(new Tarefa(descricao));
    }

    //metodo remover tarefa
    public void removerTarefa(String descricao)
    {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList)
        {
            if(t.getDescricao().equalsIgnoreCase(descricao))
            {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }   
    //metodo que retorna o numero total de tarefas na lista
    public int obterNumeroTotalTarefas()
    {
        return tarefaList.size();
    }

    //imprime todas as descrições das tarefas na lista
    public void obterDescricoesTarefas()
    {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) 
    {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        System.out.println("O número total de elemtnos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
