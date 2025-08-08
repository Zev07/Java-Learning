public class ContaBancaria implements OperacoesBancarias {
    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeEspecialUsado = 0;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Limite do cheque especial: R$" + this.limiteChequeEspecial);
        System.out.println("Usado do cheque especial: R$" + this.chequeEspecialUsado);
    }

    public boolean estaUsandoChequeEspecial() {
        return this.chequeEspecialUsado > 0;
    }

    private double quitarChequeEspecial(double valor) {
        if (this.chequeEspecialUsado <= 0) {
            return valor; // nada a quitar
        }

        double taxa = this.chequeEspecialUsado * 0.2;
        double totalDivida = this.chequeEspecialUsado + taxa;

        if (valor >= totalDivida) {
            System.out.println("Cheque especial quitado. Taxa cobrada: R$" + taxa);
            this.chequeEspecialUsado = 0;
            return valor - totalDivida;
        } else {
            // Quita parcialmente
            double valorPago = valor / 1.2; // parte do valor vai para o principal, parte para a taxa
            this.chequeEspecialUsado -= valorPago;
            System.out.println("Parte do cheque especial quitado. Restante: R$" + this.chequeEspecialUsado);
            return 0; // nada sobrou para ir para o saldo
        }
    }

    public void depositar(double valor) {
        double valorDisponivelParaDeposito = quitarChequeEspecial(valor);
        this.saldo += valorDisponivelParaDeposito;
        System.out.println("Depósito finalizado. Saldo atual: R$" + this.saldo);
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }

        double totalDisponivel = this.saldo + (this.limiteChequeEspecial - this.chequeEspecialUsado);
        if (valor <= totalDisponivel) {
            double restante = valor - this.saldo;
            this.chequeEspecialUsado += restante;
            this.saldo = 0;
            System.out.println("Saque usando cheque especial.");
            return true;
        }

        System.out.println("Saque negado. Saldo insuficiente.");
        return false;
    }

    public boolean pagarBoleto(double valor) {
        System.out.println("Tentando pagar boleto de R$" + valor);
        return sacar(valor);
    }
}