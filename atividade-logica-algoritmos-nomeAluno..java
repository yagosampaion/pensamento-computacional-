import java.util.Scanner;

public class ControleAcesso {
    public static void main(String[] args) {

        String[] listaOficial = {
            "Lucas", "Mariana", "Pedro", "Ana", "João",
            "Carla", "Bruno", "Fernanda", "Rafael", "Juliana",
            "Gabriel", "Camila", "Felipe", "Larissa", "Diego",
            "Patrícia", "Rodrigo", "Beatriz", "Thiago", "Amanda"
        };

        Scanner scanner = new Scanner(System.in);
        String continuar = "SIM";

        while (continuar.equalsIgnoreCase("SIM")) {

            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();

            boolean encontrado = false;

            // Verificação na lista
            for (int i = 0; i < listaOficial.length; i++) {
                if (nomeAluno.equalsIgnoreCase(listaOficial[i])) {
                    encontrado = true;
                    break;
                }
            }

            // Condicional
            if (encontrado) {
                System.out.println("Entrada permitida. Bem-vindo!");
            } else {
                System.out.println("Erro: Nome não encontrado. Entrada negada.");
            }

            System.out.print("Deseja verificar outro aluno? (SIM/NÃO): ");
            continuar = scanner.nextLine();
        }

        scanner.close();
    }
}