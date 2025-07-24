import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Qual a idade da primeira pessoa? ");
        int idade1 = scanner.nextInt();
        System.out.println("Qual a idade da segunda pessoa?");
        int idade2 = scanner.nextInt();
        int diferenca = idade1 - idade2;
        System.out.println("a diferença de idade é de "+ diferenca + " anos");
        scanner.close();
    }
}