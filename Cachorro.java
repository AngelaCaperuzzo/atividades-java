package teste;

public class Cachorro extends Animal {
	
	public String correr;
	
	public Cachorro()
	{
		super("O nome � Pepe",2,"Au au auuuu");
	}
	@Override
	public void som()
	{
		System.out.println(super.som);
	}
	public String getcorrer()
	{
		return correr;
	}
	public void setcorrer(String correr)
	{
		System.out.println("C�o corre");
		this.correr = correr;
		System.out.println("C�o corre");
	}
	

}
