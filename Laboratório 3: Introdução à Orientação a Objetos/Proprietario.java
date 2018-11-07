public class Proprietario{

	String nome;
	int cnh;
	int anoNascimento;

	Proprietario(){
		this("",0,0);
	}

	Proprietario(String nome, int cnh, int anoNascimento){
		this.nome = nome;
		this.cnh = cnh;
		this.anoNascimento = anoNascimento;
	}

	public int getIdade(int anoReferencia){
		int idade;

		idade = anoReferencia - this.anoNascimento;

		return idade;
	}

	public String getDescricao(){
		String descricao;

		descricao = ("Proprietario: nome="+this.nome+", cnh="+this.cnh+", anoNascimento="+this.anoNascimento+".");

		return descricao;
	}
}