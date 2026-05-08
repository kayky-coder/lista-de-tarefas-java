import java.util.ArrayList;

public class GerenciadorTarefas {

    private ArrayList<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String nome) {
        Tarefa novaTarefa = new Tarefa(nome);
        tarefas.add(novaTarefa);
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    public void concluirTarefa(int indice) {
        if (indice >= 1 && indice <= tarefas.size()) {
            Tarefa tarefa = tarefas.get(indice - 1);
            tarefa.setConcluida(true);
            System.out.println("Tarefa '" + tarefa.getNome() + "' marcada como concluída.");
        } else {
            System.out.println("Índice inválido. Por favor, tente novamente.");
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 1 && indice <= tarefas.size()) {
            Tarefa tarefa = tarefas.remove(indice - 1);
            System.out.println("Tarefa '" + tarefa.getNome() + "' removida.");
        } else {
            System.out.println("Índice inválido. Por favor, tente novamente.");
        }
    }
}
