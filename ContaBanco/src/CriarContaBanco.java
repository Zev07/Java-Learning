
import java.util.Scanner;

public class CriarContaBanco {
    int numeroConta;
    String agencia;
    String nomeCliente;
    float saldo;

    public void obterDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        this.numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite a agência: ");
        this.agencia = scanner.nextLine();
        System.out.println("Digite o nome do titular: ");
        this.nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo: ");
        this.saldo = scanner.nextFloat();
    }

    public void exibirDados() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numeroConta + " e seu saldo " + this.saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        CriarContaBanco conta = new CriarContaBanco();
        conta.obterDados();
        conta.exibirDados();
    }
}