import java.util.Scanner;

public class DiadaSemana_Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        String ndia = "";

        System.err.println("Digite um número de 1 a 7: ");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
            ndia = "Domingo";
            break;
            case 2:
            ndia = "Domingo";
            break;
            case 3:
            ndia = "Domingo";
            break;
            case 4:
            ndia = "Domingo";
            break;
            case 5:
            ndia = "Domingo";
            break;
            case 6:
            ndia = "Domingo";
            break;
            case 7:
            ndia = "Domingo";
            break;
        }
        if (ndia == ""){
            System.out.println("Valor invalido!");
        } else {
            System.out.println("Dia da Semana: " + ndia);
        }
    }
}
