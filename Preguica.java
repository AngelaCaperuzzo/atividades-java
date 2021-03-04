package teste;

public class Preguica extends Animal {
public String correr;
	
	public Preguica()
	{
		super("Juju", 1,"Aaah aaah aah ");
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
		this.correr = correr;
		System.out.println("Bicho preguiça não corre.");
	}

}
