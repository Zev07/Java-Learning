import java.util.Scanner;

public class DoWhile_Limite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite máximo (N) para a contagem:");
        int N = scanner.nextInt();
        System.out.println("Digite o limite mínimo (M) para a contagem:");
        int M = scanner.nextInt();
        int i = M;
        do {
            System.out.println(i);
            i++;
        } while (i <= N);
        scanner.close();
    }
}
