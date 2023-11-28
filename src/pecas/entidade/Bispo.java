package pecas.entidade;

import usuario.entidade.User;

public class Bispo extends Peca {

	public Bispo(CorPeca cor, User user, User outroUser) {
		super(cor, user, outroUser);
		// TODO Auto-generated constructor stub
	}

	  @Override
	    public boolean movimento(int origemC, int origemL, int destinoC, int destinoL) {
	        int deltaC = Math.abs(origemC - destinoC);
	        int deltaL = Math.abs(origemL - destinoL);

	        // Verificar se o movimento é diagonal
	        return deltaC == deltaL;
	    }

	  @Override
		public String toString() {
			// TODO Auto-generated method stub
			if (this.getCor() == CorPeca.BRANCO) {
				return "{Bb}";
			}else {
				return "{Bp}";
			}
		}

}
