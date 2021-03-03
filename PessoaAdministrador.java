package teste;

public class PessoaAdministrador extends Pessoa {
	private int ajudaDeCusto;
	
	public void imprimirInfo()
	{
		System.out.println("O nome de usuário é: "+Nome+". Seu endereço é: "+Endereço+", por fim o telefone para contato: "+Telefone+".Ajuda de Custo: "+ajudaDeCusto);
	}
	public PessoaAdministrador(String Nome,String Endereço,String Telefone)
	{
		super(Nome,Endereço,Telefone);
	}
	public PessoaAdministrador(String Nome, String Endereço, String Telefone, int ajudaDeCusto)
	{
		super(Nome,Endereço,Telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public float getajudaDeCusto()
	{
		return ajudaDeCusto;
	}
	public void setajudaDeCusto(int ajudaDeCusto)
	{
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
