package pacoteaula;

import java.util.Scanner;

public class lacoEnquanto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=0, totalA=0, totalB=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		while(idade!=-99)
		{
			if(idade<21)
			{
				totalA++;
				
			}
			else if(idade>50)
			{
				totalB++;
				
			}
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
		}
		System.out.println("O total de pessoas com menos de 21 é: "+totalA);
		System.out.println("O total de pessoas com mais de 50 é: "+totalB);
	}

}
