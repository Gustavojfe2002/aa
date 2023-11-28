package pecas.entidade;

import usuario.entidade.User;

public class Rainha extends Peca {

	public Rainha(CorPeca cor, User user, User outro) {
		super(cor, user, outro);
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
			return "{Db}";
		}else {
			return "{Dp}";
		}
	}
}
