import java.util.Scanner;

public class Contador_Prg_Regr {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o limite do contador máximo (número inteiro positivo): ");
        int max = entrada.nextInt();
        
        System.out.print("Digite o limite do contador mínimo (número inteiro positivo): ");
        int min = entrada.nextInt();

        if (max > min) {
            System.out.println("Contagem regressiva:");
            for (int contador = max; contador >= min; contador--) {
                System.out.println(contador);
            }
            
        } else if (max < min) {
            System.out.println("Contagem progressiva:");
            for (int contador = max; contador <= min; contador++) {
                System.out.println(contador);
            }
            
        } else {
            System.out.println("Os limites são iguais: " + min);
        }
        
        entrada.close();
    }
}