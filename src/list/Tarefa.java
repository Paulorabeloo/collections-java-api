package list;

public class Tarefa 
{
    //atributo
    private String descricao;

    public Tarefa(String descricao)  //construtor
    {
        this.descricao = descricao;
    }

    //metodo get
    public String getDescricao() 
    {
        return descricao; //retorna o valor da descrição
    }

    @Override
    public String toString() 
    {
        return "Tarefa [descricao=" + descricao + "]";
    }
}
