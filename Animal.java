package teste;

public abstract class Animal {
	public String nome;
	public int idade;
	public String som;
	
	public Animal(String nome, int idade, String som)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}
	public abstract void som();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	

}
