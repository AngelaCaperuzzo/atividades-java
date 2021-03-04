package teste;

public class Cavalo extends Animal {
public String correr;
	
	public Cavalo()
	{
		super("Clayton", 5,"iiiirrrh bruuuu");
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
		System.out.println("Cavalo corre");
	}

}
