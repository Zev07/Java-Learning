import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++ ){
            int tab = num * i;
            System.out.println(num+"x"+i+"="+tab);
        }
    }
}