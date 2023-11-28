package xadrez;



import pecas.entidade.Peca;
import usuario.entidade.User;

public class Tabuleiro {

	private Peca[][] lugarPeca;
	private User user1;
	private User user2;

	public Tabuleiro(User jogadorBranco, User jogadorPreto, Peca[][] pecas) {
		super();
		this.user1 = jogadorBranco;
		this.user2 = jogadorPreto;
		this.lugarPeca =pecas;
	}

	public Peca[][] getLugarPeca() {
		return lugarPeca;
	}

	public void setLugarPeca(Peca[][] lugarPeca) {
		this.lugarPeca = lugarPeca;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public void movimentarPeca(int cPeca, int lPeca, int cPecaVai, int lPecaVai) {
		
		/* Verifica se o movimento é valido e o faz se for atravez do metodo na classe Peca */
		lugarPeca[cPeca][lPeca].movimento(cPeca, lPeca, cPecaVai, lPecaVai);
		
	}

	   public void imprimirTabuleiro() {
	        
		   for (int l = 0; l < lugarPeca.length; l++) {
	            for (int c = 0; c < lugarPeca[l].length; c++) {
	               lugarPeca[c][l].toString();
	            }
	            System.out.println();
	        }
	    }
}
