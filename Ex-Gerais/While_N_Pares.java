import java.util.Scanner;

public class While_N_Pares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int N = entrada.nextInt();
        int contador = 2;
        while (contador <= N) {
            System.out.println(contador);
            contador += 2;
        }
        entrada.close();
    }
}
