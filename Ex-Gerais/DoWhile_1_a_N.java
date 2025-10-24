import java.util.Scanner;

public class DoWhile_1_a_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int N = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= N);
        scanner.close();
    }
}
