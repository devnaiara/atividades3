package atividade3;

import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int totalBackend = 0;
		int totalFrontendMulheres = 0;
		int totalMobileHomens40Mais = 0;
		int totalFullNaoBinario30Menos = 0;
		int totalPessoas = 0;
		int somaIdade = 0;
		
		while(true) {
			System.out.println("Digite a sua idade: ");
			int idade = scanner.nextInt();
			
			System.out.println("Digite a identidade de gênero (1-Mulher Cis, 2-Homem Cis, 3-Não Binário, 4-Mulher Trans, 5-Homem Trans, 6-Outros):");
			int genero = scanner.nextInt();
			
			System.out.println("Digite a categoria de desenvolvedor (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack):");
			int categoria = scanner.nextInt();
			
			if (categoria == 1) {
				totalBackend++;
			}
			if ((genero == 1 || genero == 4) && categoria == 2) {
				totalFrontendMulheres++;	
			}
			if ((genero == 2 || genero == 5) && categoria == 3 && idade > 40) {				
				totalMobileHomens40Mais++;
			}
			if (genero == 3 && categoria == 4 && idade < 30) {
				totalFullNaoBinario30Menos++;
			}
			
			totalPessoas++;
			somaIdade += idade;
			
			System.out.println("Você deseja continuar para o próximo colaborador? (S/N): ");
			scanner.nextLine();
			String resposta = scanner.nextLine();
			
			if (resposta.equalsIgnoreCase("N")) {
				break;
			}
		}	
		
		double mediaIdade = (totalPessoas > 0) ? (double) somaIdade / totalPessoas : 0;
		
		System.out.println("\nResultados da Pesquisa:");
        System.out.println("Número de pessoas desenvolvedoras Backend: " + totalBackend);
        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalFrontendMulheres);
        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalMobileHomens40Mais);
        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + totalFullNaoBinario30Menos);
        System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + mediaIdade);

        scanner.close();
	}
}