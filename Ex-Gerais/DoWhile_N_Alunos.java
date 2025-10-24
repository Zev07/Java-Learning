import java.util.Scanner;

public class DoWhile_N_Alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de alunos: ");
        int n = scanner.nextInt();
        int count = 0;
        double somaNotas = 0.0;

        do {
            System.out.print("Digite a nota do aluno " + (count + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            count++;
        } while (count < n);

        double media = somaNotas / n;
        System.out.printf("A media das notas dos %d alunos e: %.2f%n", n, media);
        scanner.close();
    }
}
