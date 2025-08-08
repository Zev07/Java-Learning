import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiro_num;
        int proximo_num;

        System.out.println("Por favor, digite o número inicial:");
        primeiro_num = scanner.nextInt();

        scanner.nextLine();

        System.out.println("\nAgora digite outros números. O programa irá parar quando um número digitado, dividido pelo número inicial (" + primeiro_num + "), tiver resto diferente de 0.");
        System.out.println("Números menores que " + primeiro_num + " serão ignorados.");

        while (true) {
            System.out.println("\nDigite o próximo número:");
            proximo_num = scanner.nextInt();
            scanner.nextLine();

            if (proximo_num < primeiro_num) {
                System.out.println("Número ignorado: " + proximo_num + " é menor que o número inicial (" + primeiro_num + ").");
                continue;
            }

            if (proximo_num % primeiro_num != 0) {
                System.out.println("Parabéns! O número " + proximo_num + " dividido por " + primeiro_num + " tem resto " + (proximo_num % primeiro_num) + " (diferente de 0).");
                System.out.println("Fim da execução.");
                break;
            } else {
                System.out.println("O número " + proximo_num + " dividido por " + primeiro_num + " tem resto 0. Continue digitando.");
            }
        }

        scanner.close();
    }
}