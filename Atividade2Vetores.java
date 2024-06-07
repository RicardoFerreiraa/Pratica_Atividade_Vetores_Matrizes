package atividadematrizevetores;

import java.util.Scanner;

public class Atividade2Vetores {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		int NumerosInteiros[]= new int[10];
		int soma=0;
		double media = 0;

		for(int indice =0; indice < 10; indice++) {
			System.out.println("Digite o número para a posição " + (indice +1) +" :" );
			NumerosInteiros[indice]=sc.nextInt();

			soma+= NumerosInteiros[indice];
		}
		System.out.println("Elementos nos índices Impares: ");
		for(int indice =0; indice <10; indice++) {
			if(NumerosInteiros[indice] % 2 != 0) {
				System.out.println(NumerosInteiros[indice]);
			}
		}
		System.out.println("Elementos nos índices pares: ");
		for(int indice =0; indice <10; indice++) {
			if(NumerosInteiros[indice] % 2 == 0) {
				System.out.println(NumerosInteiros[indice]);
			}
			media = soma / 10.0;	
		}
		System.out.println("Soma: " +soma);
		System.out.printf("Média:%.2f \n" , media);
		sc.close();
	}



}

