package pecas.entidade;

import usuario.entidade.User;

public abstract class Peca {

	private CorPeca cor;
	private User user;
	private User outroUser;

	public Peca() {
		
	}
	public Peca(CorPeca cor, User user, User outroUser) {
		super();
		this.outroUser = outroUser;
		this.user = user;
		this.cor = cor;
	}

	abstract public boolean movimento(int origemC, int origemL, int cDestino, int lDestino);

	public CorPeca getCor() {
		return cor;
	}

	public void setCor(CorPeca cor) {
		this.cor = cor;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getOutroUser() {
		return outroUser;
	}

	public void setOutroUser(User outroUser) {
		this.outroUser = outroUser;
	}

}
