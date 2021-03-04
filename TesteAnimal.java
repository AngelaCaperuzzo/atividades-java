package teste;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cão = new Cachorro ();
		Cavalo horse = new Cavalo();
		Preguica preguiça = new Preguica();
		
		System.out.println(cão.nome);
		System.out.println(cão.idade);
		System.out.println(cão.som);
		System.out.println("Cão corre");
		System.out.println("\n");
		
		System.out.println(horse.nome);
		System.out.println(horse.idade);
		System.out.println(horse.som);
		System.out.println("Cavalo corre");
		
		System.out.println("\n");
		
		System.out.println(preguiça.nome);
		System.out.println(preguiça.idade);
		System.out.println(preguiça.som);
		System.out.println("O bicho preguiça não corre");

	}

}
