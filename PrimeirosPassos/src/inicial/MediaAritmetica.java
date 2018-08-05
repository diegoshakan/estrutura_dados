package inicial;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas[] = new double[4];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
            media += notas[i];
        }

        media = media / 4;
        System.out.printf("Sua média é: %.2f ", media);

        if (media < 3 && media > 0) {
        System.out.println("Aluno Reprovado");
        }
        else if (media >= 3 && media < 6) {
        System.out.println("Aluno em Recuperação");
        }
        else if (media >= 6 && media <= 10) {
        System.out.println("Aluno Aprovado");
        }
        else {
                System.out.println("Nota inexistente");
                }
    
    }

}
