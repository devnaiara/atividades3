package atividade3;

import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int numero;
		int soma = 0;
		
		System.out.println("Digite números positivos. - Digite 0 para encerrar o programa.");
		
		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			
			if (numero > 0) {
				soma = soma + numero;
				} else if (numero < 0) {
					System.out.println("Número negativo. ");
				}
				
        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + soma);

        scanner.close();
    }
}
