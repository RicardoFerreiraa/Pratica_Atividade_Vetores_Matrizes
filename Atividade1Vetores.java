package atividadematrizevetores;

import java.util.Scanner;


public class Atividade1Vetores {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int NumerosVetor[]= {2,5,1,3,4,9,7,8,10,6};
		int NumeroDigitado;
		int posicao = 0 ;

		System.out.println("Digite o Número que você deseja encontar: ");
		NumeroDigitado=sc.nextInt();

		for(int i=0; i <NumerosVetor.length; i++) {
			if(NumerosVetor[i] == NumeroDigitado) {
				posicao = i;
				break;
			}
		}
		if(posicao != 0) {
			System.out.println("O número " +NumeroDigitado + " esta localizado na posição: " +posicao);

		}else
			System.out.println("O número" +NumeroDigitado +" Não foi encontrado!");
		sc.close();	
	}
}
