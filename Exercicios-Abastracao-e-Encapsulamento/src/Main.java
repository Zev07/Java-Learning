import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Java!");
        System.out.print("Digite o valor do depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();

        OperacoesBancarias conta = new ContaBancaria(depositoInicial);

        int opcao;

        do {
            System.out.println("\n===== MENU BANCÁRIO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar uso do cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.print("Valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Falha no saque.");
                    }
                    break;
                case 5:
                    System.out.print("Valor do boleto: R$ ");
                    double boleto = scanner.nextDouble();
                    if (conta.pagarBoleto(boleto)) {
                        System.out.println("Boleto pago com sucesso.");
                    } else {
                        System.out.println("Falha ao pagar o boleto.");
                    }
                    break;
                case 6:
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("Você está utilizando o cheque especial.");
                    } else {
                        System.out.println("Você NÃO está utilizando o cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}