import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Olá "+ nome +" Qual o ano do seu nascimento? Digite nesse formato YYYY");
        int ano = scanner.nextInt();
        int idade = 2025 - ano;
        System.out.println(nome +" Você tem "+idade+" anos de idade");
        scanner.close();
        }
    }