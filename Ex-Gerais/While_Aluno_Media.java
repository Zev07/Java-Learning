import java.util.Scanner;

public class While_Aluno_Media {
    public static void main(String[] args) {
        int qtde,contador;
        double nota1, nota2, media;

        String nome;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        qtde = entrada.nextInt();
        contador = 0;

        entrada.nextLine();
    
    while (contador < qtde) {
        System.out.println("Digite o nome do aluno: ");
        nome = entrada.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.printf("A média do aluno %s é %.2f%n", nome, media);
        if (media > 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        entrada.nextLine();
        contador++;
    }
    entrada.close();
}
}
