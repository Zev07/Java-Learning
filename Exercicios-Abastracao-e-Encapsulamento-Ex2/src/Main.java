import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        int opcao;

        do {
            System.out.println("\n===== MENU DO CARRO =====");
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Acelerar");
            System.out.println("4. Frear");
            System.out.println("5. Mudar marcha");
            System.out.println("6. Mudar direção");
            System.out.println("7. Ver velocidade");
            System.out.println("8. Ver direção atual");
            System.out.println("9. Ver marcha atual");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    System.out.print("Informe o valor para frear: ");
                    int freio = scanner.nextInt();
                    carro.frear(freio);
                    break;
                case 5:
                    System.out.print("Informe a nova marcha: ");
                    int marcha = scanner.nextInt();
                    carro.mudarMarcha(marcha);
                    break;
                case 6:
                    System.out.print("Informe a nova direção (esquerda/direita): ");
                    String direcao = scanner.next();
                    carro.virar(direcao);
                    break;
                case 7:
                    System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
                    break;
                case 8:
                    System.out.println("Direção atual: " + carro.getDirecaoAtual());
                    break;
                case 9:
                    System.out.println("Marcha atual: " + carro.getMarcha());
                    break;
                case 10:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 10);

        scanner.close();
    }
}
