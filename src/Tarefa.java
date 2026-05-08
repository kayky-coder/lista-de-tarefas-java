public class Tarefa {

    private String nome;
    private boolean concluida;

    public Tarefa(String nome) {
        this.nome = nome;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public boolean isConcluida() {
        return concluida;
    }
    @Override
    public String toString() {
        return "Tarefa: " + nome + " - " + (concluida ? "Concluída [✓]" : "Pendente [ ]");
    }
}
     
