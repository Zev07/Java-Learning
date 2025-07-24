import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int primeiro_num = scanner.nextInt();
        System.out.println("Digite um número maior que o anterior:");
        int segundo_num = scanner.nextInt();
        scanner.nextLine(); /* pra limpar o buffer anterior*/
        if (primeiro_num < segundo_num){
            System.out.println("\nNumeros pares entre " + primeiro_num + " e " + segundo_num);
            for (int i = primeiro_num; i <= segundo_num; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + "\n");
                }
            }
            System.out.println("\nNúmeros ímpares entre " + primeiro_num + " e " + segundo_num + ":");
            for (int i = primeiro_num; i <= segundo_num; i++){
                if (i % 2 != 0){
                    System.out.print(i + "\n");
                }
            }
            System.out.println();
        } else {System.out.println("O valor do segundo número não é maior que o primeiro!");}
        scanner.close();
    }
}