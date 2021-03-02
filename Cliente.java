package teste;

public class Cliente {
	private String Nome;
	private String Nascimento;
	private String Telefone; //atributos
	private int numeroCadastro;
	
	public Cliente (String Nome,String Nascimento,String Telefone, int numeroCadastrado)
	{
		this.Nome = Nome;
		this.Nascimento = Nascimento;
		this.Telefone = Telefone;//construtor
		this.numeroCadastro = numeroCadastro;
	}
	

	public void imprimirDados()
	{
		System.out.println("Nome do cliente: "+Nome+" , nascido em: "+Nascimento+" ,Telefone: "+Telefone+" possui cadastro registrado como: "+numeroCadastro);
		
	}
	public String getNome()
	{
		return Nome;
	}
	public void setNome(String Nome)
	{
		this.Nome = Nome;
	}
	public String getNascimento()
	{
		return Nascimento;
	}
	public void setNascimento(String Nascimento)
	{
		this.Nascimento = Nascimento;
	}
	public String getTelefone()
	{
		return Telefone;
	}
	public void setTelefone(String Telefone)
	{
		this.Telefone = Telefone;
	}
	public int getnumeroCadastro()
	{
		return numeroCadastro;
	}
	public void setnumeroCadastro(int numeroCadastro)
	{
		this.numeroCadastro = numeroCadastro;
	}
}
