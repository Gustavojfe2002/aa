package usuario.controle;

import pecas.entidade.Bispo;
import pecas.entidade.Cavalo;
import pecas.entidade.CorPeca;
import pecas.entidade.Peao;
import pecas.entidade.Peca;
import pecas.entidade.Rainha;
import pecas.entidade.Rei;
import pecas.entidade.Torre;
import usuario.entidade.User;
import xadrez.Tabuleiro;

public class InicioGame {
	

	public static Tabuleiro iniciarJogo(String jogador1, String jogador2) {
		
		Peca[][] lugarPeca = null;
		
		User player1 = new User(CorPeca.BRANCO, jogador1);
		User player2 = new User(CorPeca.PRETO, jogador2);
		
		for (int coluna = 0; coluna < 8; coluna++) {
		    lugarPeca[coluna][1] = new Peao(CorPeca.BRANCO, player1, player2);
			lugarPeca[coluna][6] = new Peao(CorPeca.PRETO, player1, player2);
		}

		for (int coluna = 0; coluna < 8; coluna++) {
		    for (int linha = 2; linha < 5; linha++) {
		    	
		      
		    }
		}

		lugarPeca[0][0] = new Torre(CorPeca.BRANCO, player1, player2);
		lugarPeca[1][0] = new Cavalo(CorPeca.BRANCO, player1, player2);
		lugarPeca[2][0] = new Bispo(CorPeca.BRANCO, player1, player2);
		lugarPeca[3][0] = new Rainha(CorPeca.BRANCO, player1, player2);
		lugarPeca[4][0] = new Rei(CorPeca.BRANCO, player1, player2);
		lugarPeca[5][0] = new Bispo(CorPeca.BRANCO, player1, player2);
		lugarPeca[6][0] = new Cavalo(CorPeca.BRANCO, player1, player2);
		lugarPeca[7][0] = new Torre(CorPeca.BRANCO, player1, player2);

		lugarPeca[0][7] = new Torre(CorPeca.PRETO, player1, player2);
		lugarPeca[1][7] = new Cavalo(CorPeca.PRETO, player1, player2);
		lugarPeca[2][7] = new Bispo(CorPeca.PRETO, player1, player2);
		lugarPeca[3][7] = new Rainha(CorPeca.PRETO, player1, player2);
		lugarPeca[4][7] = new Rei(CorPeca.PRETO, player1, player2);
		lugarPeca[5][7] = new Bispo(CorPeca.PRETO, player1, player2);
		lugarPeca[6][7] = new Cavalo(CorPeca.PRETO, player1, player2);
		lugarPeca[7][7] = new Torre(CorPeca.PRETO, player1, player2);

		
		Tabuleiro jogo = new Tabuleiro(player1, player2, lugarPeca);
		
		return jogo;
	}


	
	public static Tabuleiro interacaoComJogo(Tabuleiro jogo) {
		
		/*Chama movimentos/ controla quem faz o movimento etc.*/
		
		return jogo;
	}
	

}



