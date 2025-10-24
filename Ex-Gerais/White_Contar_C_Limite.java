import java.util.Scanner;

public class White_Contar_C_Limite {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        System.out.println("Digite o limite minimo para contar:");
        int limiteMinimo = entrada.nextInt();
        System.out.println("Digite o limite maximo para contar:");
        int limiteMaximo = entrada.nextInt();
        int contador = limiteMinimo;
        if (limiteMinimo > limiteMaximo) {
            while (contador >= limiteMaximo) {
                System.out.println(contador);
                contador--;
            }
        } else if (limiteMaximo < limiteMinimo) {
            while (contador <= limiteMaximo) {
                    System.out.println(contador);
                    contador++;
            }
        }
        entrada.close();
    }
}
