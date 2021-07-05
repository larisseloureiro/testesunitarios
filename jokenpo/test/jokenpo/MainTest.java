package jokenpo;

import org.junit.Test;

public class MainTest extends Partida{
	 @Test
	public void testarEmpate() throws Exception {
		Jogadores jogadorUm = new Jogadores();
		Jogadores jogadorDois = new Jogadores();
		
		jogadorUm.setpUm("pedra");
		String x = jogadorUm.getpUm();
		
		jogadorDois.setpDois("pedra");
		String y = jogadorDois.getpDois();
	
		
		if(x == y) {
			System.out.println("empate");
			 return;
		} else if( x != y) {
			System.out.println("ganhou");
			return;
		}
		
	 }
	 
	 @Test
		public void testarJogadorUmVence() throws Exception {
			Jogadores jogadorUm = new Jogadores();
			Jogadores jogadorDois = new Jogadores();
			
			jogadorUm.setpUm("pedra");
			String x = jogadorUm.getpUm();
			
			jogadorDois.setpDois("tesoura");
			String y = jogadorDois.getpDois();
		
			
			if(x == y) {
				System.out.println("empate");
				 return;
			} else if( x != y) {
				System.out.println("ganhou");
				return;
			}
			
		 }
	 
	 
	 
}
