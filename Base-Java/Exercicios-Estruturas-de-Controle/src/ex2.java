import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Scanner usando o modo local de numeros decimais, ou seja, aceita apenas números com virgula*/
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        double imc = peso/(altura*altura);
        System.out.printf("Seu imc é de %.2f", imc);
    }
}