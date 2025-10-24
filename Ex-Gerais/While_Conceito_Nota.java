import java.util.Scanner;

public class While_Conceito_Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtde, contador;
        double nota1, nota2, media;
        String nome;

        System.out.println("Digite a quantidade de alunos: ");
        qtde = entrada.nextInt();
        contador = 0;

        entrada.nextLine();
        while (contador < qtde) {
            System.out.println("Digite o nome do aluno: ");
            nome = entrada.nextLine();

            System.out.println("Digite a primeira nota de " + nome + ": ");
            nota1 = entrada.nextDouble();

            System.out.println("Digite a segunda nota de " + nome + ": ");
            nota2 = entrada.nextDouble();

            media = (nota1 + nota2) / 2;
            System.out.printf("A média de %s é: %.2f%n", nome, media);
            
            if (media < 6) {
                System.out.println("Aluno reprovado.");
            } else {
                System.out.println("Aluno aprovado.");
            }

            if (media < 6) {
                System.out.println("Grau insuficiente.");
            } else if (media < 8) {
                System.out.println("Grau regular.");
            } else if (media <9) {
                System.out.println("Grau bom.");
            } else {
                System.out.println("Grau excelente.");
            }
            entrada.nextLine(); // Limpar o buffer
            contador++;
        }
        entrada.close();
    }
}
