package usuario.entidade;


import pecas.entidade.CorPeca;

public class User {

	
	private String nome;
	private CorPeca cor;
	
	public User( CorPeca cor, String nome) {
		super();
		this.cor = cor;
		this.nome = nome;
	}


	public CorPeca getCor() {
		return cor;
	}

	public void setCor(CorPeca cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	
}
