package pacoteaula;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.*/
		
		int num[] = new int[6], somaPar=0, contImpar=0, contPar=0;
		
		Scanner leia = new Scanner(System.in);
		for(int x=0;x<6;x++)
		{
			System.out.println("Digite um n�mero: ");
			num[x] = leia.nextInt();
			
			if(num[x]%2==0) 
			{
				contPar++;
				somaPar = somaPar + num[x];
				
			}
			else
			{
				contImpar++;
				
			}
		}
		System.out.println("Quantidade de pares digitados: "+contPar);
		System.out.println("A soma dos n�mros pares �: "+somaPar);
		System.out.println("A quantidade de n�meros �mpares digitados � de: "+contImpar);
	}

}
