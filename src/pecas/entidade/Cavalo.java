package pecas.entidade;

import usuario.entidade.User;

public class Cavalo extends Peca {


	
	@Override
	public boolean movimento(int origemC, int origemL, int cDestino, int lDestino) {
		int a = Math.abs(origemC - cDestino);
		int b = Math.abs(origemL - lDestino);
		
		 return (a == 2 && a == 1) || (b == 1 && b == 2);
		/*Logica para validar movimento*/
		
	}
	
	public Cavalo(CorPeca cor, User user, User outroUser) {
		super(cor, user, outroUser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (this.getCor() == CorPeca.BRANCO) {
			return "{Cb}";
		}else {
			return "{Cp}";
		}
	}
}
