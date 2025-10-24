import java.util.Scanner;

public class ContadorComLimite {
    public static void main(String[] args) {
        int limite;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o limite do contador (número inteiro positivo): ");
        limite = entrada.nextInt();
        for (int contador = 1; contador <= limite; contador++) {
            System.out.println(contador);
        }
        entrada.close();
    }
}
