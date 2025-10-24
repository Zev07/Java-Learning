import java.util.Scanner;

public class DoWhile_Limite_IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite minimo (M) para a contagem:");
        int min = scanner.nextInt();
        System.out.println("Digite o limite maximo (N) para a contagem:");
        int max = scanner.nextInt();

        if (min > max) {
            do {
                System.out.println(min);
                min--;
            } while (min >= max);
        } else {
            do {
                System.out.println(max);
                max++;
            } while (max <= min);
        }
        scanner.close();
    }
}
