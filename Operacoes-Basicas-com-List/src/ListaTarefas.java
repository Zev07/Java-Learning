import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void  adicionarTarefas(String descricao) {
        tarefasList.add(new Tarefas (descricao));
    }

    public void removerTarefas(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas t : tarefasList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add (t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("total: " + listaTarefas.obterNumeroTotalTarefas());
    }
}
