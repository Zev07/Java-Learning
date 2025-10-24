import java.util.Scanner;

public class SomaDoisNumerosFlutuante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1,n2,soma;

        System.out.println("Digite um número: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite outr número: ");
        n2 = entrada.nextDouble();

        soma = n1 + n2;
        System.out.println("A soma é " + soma);

        entrada.close();
    }
}
