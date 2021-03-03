package teste;

public class PessoaAdministrador extends Pessoa {
	private int ajudaDeCusto;
	
	public void imprimirInfo()
	{
		System.out.println("O nome de usu�rio �: "+Nome+". Seu endere�o �: "+Endere�o+", por fim o telefone para contato: "+Telefone+".Ajuda de Custo: "+ajudaDeCusto);
	}
	public PessoaAdministrador(String Nome,String Endere�o,String Telefone)
	{
		super(Nome,Endere�o,Telefone);
	}
	public PessoaAdministrador(String Nome, String Endere�o, String Telefone, int ajudaDeCusto)
	{
		super(Nome,Endere�o,Telefone);
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
