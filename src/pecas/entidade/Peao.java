package pecas.entidade;

import usuario.entidade.User;

public class Peao extends Peca {


	public Peao(CorPeca cor, User user, User outroUser) {
		super(cor, user, outroUser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean movimento(int origemC, int origemL, int cDestino, int lDestino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (this.getCor() == CorPeca.BRANCO) {
			return "{Pb}";
		}else {
			return "{Pp}";
		}
	}

}
