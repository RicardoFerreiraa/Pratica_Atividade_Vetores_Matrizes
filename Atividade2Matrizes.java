package atividadematrizevetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade2Matrizes {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		double Notas[][] = new double[10][4];
		double Medias[]= new double [10];
		double Soma =0;
		DecimalFormat forma = new DecimalFormat("#.#"); // procurei na internet uma forma de ajustar o println em formato decimal

		for(int indice =0; indice <10; indice++) {
			
		for(int Coluna=0; Coluna <4; Coluna++) {
			System.out.println("Digite a nota do bimestre " + (Coluna +1) + " do participante " + (indice+1) + " :");
			Notas[indice][Coluna] = sc.nextDouble();

			Soma+= Notas[indice][Coluna];
		}
		Medias[indice] = Soma /4;
		}
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Média do participante " + (indice +1) + ": " + forma.format(Medias[indice]));
			sc.close();
		}
	}
}