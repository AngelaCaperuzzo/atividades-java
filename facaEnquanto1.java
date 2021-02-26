package pacoteaula;

import java.util.Scanner;

public class facaEnquanto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*fazer ate achar 0, depois somar tudo*/
		
		int num, soma=0;
		Scanner leia = new Scanner(System.in);
		do
		{
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num>0)
			{
				
				soma = soma + num;
			}
			else
			{
				System.out.println("ok");
			}
			
		}
			while(num!=0);
		System.out.println("A soma das idades diferentes de zero (0) é: "+soma);
	}

}
