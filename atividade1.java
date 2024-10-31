package atividade3;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		
		//for usa inteiro i ou j ou nome contador
		//for (i=1; i<=10; i++){
		//resul = 2*i;
		//print(resul)}
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite um segundo número: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 < numero2) {
        	System.out.println("Números no intervalo:");
            for (int i = numero1; i <= numero2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " É múltiplo de 3 e 5.");
                }
            }
            
        } else {
            System.out.println("Intervalo inválido. O segundo número é menor que o primeiro número. ");
            scanner.close();

        }
	}
}
