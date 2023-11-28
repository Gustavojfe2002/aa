package usuario.view;

import java.util.Scanner;

import usuario.controle.InicioGame;
import xadrez.Tabuleiro;

public class Usuario {
	

	public static void iniciarJogo() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do player1 : ");
		String nome1 = input.nextLine();
		
		System.out.println("Digite o nome do player2 : ");
		String nome2 = input.nextLine();
		
		Tabuleiro jogo = InicioGame.iniciarJogo(nome1, nome2);
		
		jogo.imprimirTabuleiro();
		
		input.close();
	}
	
	
	
	
}
