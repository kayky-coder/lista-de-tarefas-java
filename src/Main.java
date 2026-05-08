
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciadorTarefas gerenciador = new GerenciadorTarefas();
 
 int opcao = 0; 
 do {
        System.out.println("\nMenu de Tarefas:");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Listar Tarefas");
        System.out.println("3. Concluir Tarefa");
        System.out.println("4. Remover Tarefa");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome da tarefa: ");
                String nomeTarefa = scanner.nextLine();
                gerenciador.adicionarTarefa(nomeTarefa);
                break;
            case 2:
                gerenciador.listarTarefas();
                break;
            case 3:
                System.out.print("Digite o número da tarefa a concluir: ");
                int indiceConcluir = scanner.nextInt();
                gerenciador.concluirTarefa(indiceConcluir);
                break;
            case 4:
                System.out.print("Digite o número da tarefa a remover: ");
                int indiceRemover = scanner.nextInt();
                gerenciador.removerTarefa(indiceRemover);
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
    } while (opcao != 5);
}
}
