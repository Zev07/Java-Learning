import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retangulo? ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo? ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("A area do quadrado será: "+ area);
        scanner.close();
        }
    }
