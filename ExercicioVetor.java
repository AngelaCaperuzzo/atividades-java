package pacoteaula;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.*/
		
		int num[] = new int[6], somaPar=0, contImpar=0, contPar=0;
		
		Scanner leia = new Scanner(System.in);
		for(int x=0;x<6;x++)
		{
			System.out.println("Digite um número: ");
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
		System.out.println("A soma dos númros pares é: "+somaPar);
		System.out.println("A quantidade de números ímpares digitados é de: "+contImpar);
	}

}
