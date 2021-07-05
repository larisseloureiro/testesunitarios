package jokenpo;

import java.util.Scanner;

public class Partida {
	
	public static void main (String args[]) {
		
		Jogadores jogadorUm = new Jogadores();
		Jogadores jogadorDois = new Jogadores();
		String ler;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jogador 1: Escolha entre pedra, papel ou tesoura: ");
		ler = sc.nextLine();
		jogadorUm.setpUm(ler);
		
		System.out.println("Jogador 2: Escolha entre pedra, papel ou tesoura: ");
		ler = sc.nextLine();
		jogadorDois.setpDois(ler);
		
		if(jogadorUm.getpUm().equals("papel") && jogadorDois.getpDois().equals("papel")) {
			System.out.println("Empate");
		} else if (jogadorUm.getpUm().equals("pedra") && jogadorDois.getpDois().equals("tesoura")) {
			System.out.println("Pedra vence!");
			
		} else if (jogadorUm.getpUm().equals("tesoura") && jogadorDois.getpDois().equals("tesoura")) {
			System.out.println("Empate");
		} else if (jogadorUm.getpUm().equals("tesoura") && jogadorDois.getpDois().equals("papel")) {
			System.out.println("Tesoura vence!");
		}
		
		else if( jogadorUm.getpUm().equals("papel") && jogadorDois.getpDois().equals("papel")) {
			System.out.println("Empate!");
		} else if (jogadorUm.getpUm().equals("papel") && jogadorDois.getpDois().equals("pedra")) {
			System.out.println("Papel vence!");
		}
	
	
	}
	
	
}
