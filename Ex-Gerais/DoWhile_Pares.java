public class DoWhile_Pares {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Números pares de 0 a 100:");
        do {
            System.out.println(numero);
            numero += 2;
        } while (numero <= 100);
    }
}
