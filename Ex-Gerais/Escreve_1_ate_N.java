import java.util.Scanner;

public class Escreve_1_ate_N {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int N = entrada.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        entrada.close();
    }
}
