import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        int n1,n2,soma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite um segundo número: ");
        n2 = entrada.nextInt();
        soma = n1 + n2;
        System.out.println("a soma dos números é: " + soma);
        entrada.close();

    }
}
