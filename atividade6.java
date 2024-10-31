package atividade3;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite um número (0 para encerrar): ");
            numero = scanner.nextInt();

            if (numero != 0 && numero % 3 == 0) {
                soma = soma  + numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números múltiplos de 3 é: " + media);
        } else {
            System.out.println("Nenhum múltiplo de 3 foi digitado.");
        }

        scanner.close();
    }
}

