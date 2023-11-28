package usuario.view;

import java.util.Scanner;

import usuario.controle.InicioGame;

public class entradaUsuario {
	
	public static void iniciarJogoView() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do player1 : ");
		String nome1 = input.nextLine();
		
		System.out.println("Digite o nome do player2 : ");
		String nome2 = input.nextLine();
		
		InicioGame.iniciarJogo(nome1, nome2);
		input.close();
	}
	
	
	
	
}
