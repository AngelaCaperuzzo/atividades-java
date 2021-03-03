package teste;

public class Pessoa {
	public String Nome;
	public String Endereço;
	public String Telefone;
	
	public Pessoa (String Nome, String Endereço, String Telefone)
	{
		this.Nome = Nome;
		this.Endereço = Endereço;
		this.Telefone = Telefone;
	}
	public void imprimirInfo()
	{
		System.out.println("O nome de usuário é: "+Nome+". Seu endereço é: "+Endereço+", por fim o telefone para contato: "+Telefone+".");
	}
	public String getNome()
	{
		return Nome;
	}
	public void setNome(String Nome)
	{
		this.Nome = Nome;
	}
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
}
