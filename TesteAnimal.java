package teste;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c�o = new Cachorro ();
		Cavalo horse = new Cavalo();
		Preguica pregui�a = new Preguica();
		
		System.out.println(c�o.nome);
		System.out.println(c�o.idade);
		System.out.println(c�o.som);
		System.out.println("C�o corre");
		System.out.println("\n");
		
		System.out.println(horse.nome);
		System.out.println(horse.idade);
		System.out.println(horse.som);
		System.out.println("Cavalo corre");
		
		System.out.println("\n");
		
		System.out.println(pregui�a.nome);
		System.out.println(pregui�a.idade);
		System.out.println(pregui�a.som);
		System.out.println("O bicho pregui�a n�o corre");

	}

}
