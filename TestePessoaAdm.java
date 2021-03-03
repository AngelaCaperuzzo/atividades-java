package teste;

public class TestePessoaAdm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaAdministrador adm1 = new PessoaAdministrador("Caique","RUA: Esta Rua,111 Jardim-Este Jardim","4147-4147", 120000);
		PessoaAdministrador adm2 = new PessoaAdministrador("Alexia","RUA: Aquela Rua,222 Jardim-Este Jardim","4141-4141", 80000);
		PessoaAdministrador adm3 = new PessoaAdministrador("Adilson","RUA: Rua Delá,333 Jardim-Este Jardim","4140-4140", 9000);
		
		adm1.imprimirInfo();
		adm2.imprimirInfo();
		adm3.imprimirInfo();
		
		
	}
	

}
