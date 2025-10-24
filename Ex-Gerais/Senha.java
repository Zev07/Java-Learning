import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        String senhacorreta = "java123";
        Scanner scanner = new Scanner(System.in);
        String senhaDigitada = "";

        System.out.println("Digite a senha:");
        senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(senhacorreta)) {
            System.out.println("Senha incorreta. Tente novamente:");
            senhaDigitada = scanner.nextLine();
        }
        System.out.println("Senha correta!");
        scanner.close();
    }
}
