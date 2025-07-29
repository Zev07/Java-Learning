public interface OperacoesBancarias {
    void consultarSaldo();
    void consultarChequeEspecial();
    void depositar(double valor);
    boolean sacar(double valor);
    boolean pagarBoleto(double valor);
    boolean estaUsandoChequeEspecial();
}
