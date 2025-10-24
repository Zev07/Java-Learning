import java.util.Scanner;

public class DiadaSemana_If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        String ndia = "";
        System.out.println("Digite um número correspodente ao dia da semana: ");
        dia = entrada.nextInt();

        if (dia == 1) {
            ndia = "Domingo";
        } else if (dia == 2) {
            ndia = "Segunda";
        }
        else if (dia == 3) {
            ndia = "Terça";
        }
        else if (dia == 4) {
            ndia = "Quarta";
        }
        else if (dia == 5) {
            ndia = "Quinta";
        }
        else if (dia == 6) {
            ndia = "Sexta";
        }
        else if (dia == 7) {
            ndia = "Sabádo";
        }
        if (ndia == ""){
            System.out.println("Entrada inválida!");
        } else {
            System.out.println("Dia da Semana: " + ndia);
        }

        entrada.close();
    }
}
