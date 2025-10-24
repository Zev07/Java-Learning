import java.util.Scanner;

public class MaiorQue {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double n1,n2;
        
        System.err.println("Digite o primeiro número: ");
        n1 = entrada.nextDouble();

        System.err.println("Digite o segundo número: ");
        n2 = entrada.nextDouble();

        if (n1 > n2){
            System.out.println("O primeiro número é maior que o segundo");
        } else {
            System.err.println("O segundo número é maior que o primeiro");
        }
    }
}
