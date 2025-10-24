import java.util.Scanner;

public class For_MediaAlunosTurma {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Quantidade de alunos da turma: ");
            int qtdeAlunos = entrada.nextInt();

            for (int i = 1; i <= qtdeAlunos; i++) {
                System.out.println("\n--- Aluno " + i + " ---");
                entrada.nextLine();
                
                System.out.print("Nome do aluno: ");
                String nome = entrada.nextLine();

                System.out.print("Primeira nota: ");
                float n1 = entrada.nextFloat();

                System.out.print("Segunda nota: ");
                float n2 = entrada.nextFloat();

                float media = (n1 + n2) / 2;

                System.out.printf("A média de %s é: %.2f\n", nome, media);
                if (media >= 6) {
                    System.out.println("Situação: Aluno aprovado!");
                } else {
                    System.out.println("Situação: Aluno reprovado!");
                }
            }
        }
    }
}