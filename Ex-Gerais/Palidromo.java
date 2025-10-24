public class Palidromo {
    public static void main(String[] args) {
        String palavra = "arara";
        String reverso = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverso += palavra.charAt(i);
        }
        if (palavra.equals(reverso)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
