import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaBanhoPet maquina = new MaquinaBanhoPet();

        int opcao;

        do {
            System.out.println("\n===== MENU BANHO PET =====");
            System.out.println("1. Colocar pet");
            System.out.println("2. Retirar pet");
            System.out.println("3. Dar banho");
            System.out.println("4. Abastecer água");
            System.out.println("5. Abastecer shampoo");
            System.out.println("6. Verificar nível de água");
            System.out.println("7. Verificar nível de shampoo");
            System.out.println("8. Limpar máquina");
            System.out.println("9. Ver status completo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquina.colocarPet();
                    break;
                case 2:
                    maquina.retirarPet();
                    break;
                case 3:
                    maquina.darBanho();
                    break;
                case 4:
                    maquina.abastecerAgua();
                    break;
                case 5:
                    maquina.abastecerShampoo();
                    break;
                case 6:
                    maquina.verificarNivelAgua();
                    break;
                case 7:
                    maquina.verificarNivelShampoo();
                    break;
                case 8:
                    maquina.limparMaquina();
                    break;
                case 9:
                    maquina.status();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}