package exerciciosJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> Estoque = new ArrayList();
		
		do
		{
			System.out.println("Seja bem vindo ao Estoque!");
			System.out.println("Por gentileza, escolha uma das opções: \n1- Armazenar dados.\n2- Remover dados.\n3- Atualizar dados.\n4- Apresentar todos os dados.\n5- Sair do menu de Estoque.");
			op = leia.nextInt();
			switch(op)
			{
			case 1:
				leia.nextInt();
				System.out.println("Digite aqui os dados que deseja armazenar: ");
				String produto = leia.nextLine();
				Estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("Digite aqui os dados que precisam ser removido: ");
				String produtoRemovido = leia.nextLine();
				if(Estoque.contains(produtoRemovido))
				{
					Estoque.remove(produtoRemovido);
				}
				else
				{
					System.out.println("Desculpe, mas esta informação nunca esteve no Estoque antes...");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("Digite aqui os dados que precisam ser atualizados: ");
				String atualiza = leia.nextLine();
				System.out.println("Digite o novo dado: "+atualiza);
				String novoDado = leia.nextLine();
				if(Estoque.contains(atualiza))
				{
					Estoque.remove(atualiza);
					Estoque.add(novoDado);
				}
				else
				{
					System.out.println("Este dado não pode ser confirmado...");
				}
				System.out.println(Estoque);
				break;
			case 4:
				System.out.println("Aqui estão todos os dados solicitados: ");
				System.out.println(Estoque);
				break;
				default:
					System.out.println("O programa foi finalizado!");
				
			}
			
		}while(op!=5);

	}

}
