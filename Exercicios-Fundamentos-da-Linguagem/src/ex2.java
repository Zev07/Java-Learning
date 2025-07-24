import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira area do quadrado? ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("A area do quadrado será: "+ area);
        scanner.close();
        }
    }