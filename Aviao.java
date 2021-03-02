package teste;

public class Aviao {
	public String modelo;
	public String tipo;
	public int ano;
	
	public Aviao (String modelo, String tipo, int ano)
	{
		this.modelo = modelo;
		this.tipo = tipo;
		this.ano = ano;
	}
	public void imprimirDados()
	{
		System.out.println("O modelo do avião é: "+modelo+" , seu tipo é: "+tipo+" , seu atual modelo foi construído no ano de: "+ano);
	}
	public String getmodelo()
	{
		return modelo;
	}
	public void setmodelo(String modelo)
	{
		this.modelo = modelo;
	}
	public String tipo()
	{
		return tipo;
	}
	public void settipo(String tipo)
	{
		this.tipo = tipo;
	}
	public int getano()
	{
		return ano;
	}
	public void setano(int ano)
	{
		this.ano = ano;
	}

}
