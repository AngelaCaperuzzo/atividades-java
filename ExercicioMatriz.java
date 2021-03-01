package pacoteaula;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		int x[][] = new int[3][3], cont=0;
		Scanner leia = new Scanner(System.in);
		
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("Digite um número: ");
				x[l][c] = leia.nextInt();
				if(x[l][c]>10)
				{
					cont++;	
					System.out.println("Os valors maiores que 10 são: "+cont);
				}
				
			}
		
		}
		
	}

}
