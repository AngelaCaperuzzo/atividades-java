package teste;

public class Pessoa {
	public String Nome;
	public String Endere�o;
	public String Telefone;
	
	public Pessoa (String Nome, String Endere�o, String Telefone)
	{
		this.Nome = Nome;
		this.Endere�o = Endere�o;
		this.Telefone = Telefone;
	}
	public void imprimirInfo()
	{
		System.out.println("O nome de usu�rio �: "+Nome+". Seu endere�o �: "+Endere�o+", por fim o telefone para contato: "+Telefone+".");
	}
	public String getNome()
	{
		return Nome;
	}
	public void setNome(String Nome)
	{
		this.Nome = Nome;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
}
