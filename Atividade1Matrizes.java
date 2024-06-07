package atividadematrizevetores;

import java.util.Scanner;

public class Atividade1Matrizes {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int MatrizNumeros[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int SomaDiagonalPrincipal =0;
		int SomaDiagonalSecundaria =0;


		System.out.println("Elementos da Diagonal Principal: ");
		for(int indice =0; indice <MatrizNumeros.length; indice++) {
			System.out.println(MatrizNumeros[indice][indice]);

			SomaDiagonalPrincipal += MatrizNumeros[indice][indice];
		}
		System.out.println("Elementos da Diagonal Secundaria: ");
		for(int indice =0; indice <MatrizNumeros.length; indice++) {
			System.out.println(MatrizNumeros[indice][MatrizNumeros.length - indice -1]);

			SomaDiagonalSecundaria += MatrizNumeros[indice][MatrizNumeros.length - indice - 1];
		}
		System.out.println("Soma dos Elementos da Diagonal Principal: " +SomaDiagonalPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundaria: "+SomaDiagonalSecundaria);
		sc.close();
	}

}
