package Controller;

import br.com.leandrocolevati.pilhastring.Pilha;

public class PalindromoController {
	
	//A classe PalindromoController no package controller deve ter 2 métodos:
				// •O método comparaPalavras, que recebe o String, o String já invertido e retorna um boolean (True para Palíndromo e False para Não Palíndromo)
		 

	public static boolean comparaPalavras (String candidato,String otadidnac) {
		// •O método comparaPalavras, que recebe o String e o String já invertido 
		Boolean possivel= true;
		
		int x = 0;
		
		while (possivel && x<=candidato.length()) {
			possivel = candidato.charAt(x)==otadidnac.charAt(x);
			x++;
		}
			//retorna um boolean (True para Palíndromo e False para Não Palíndromo)
		return possivel;
	}

	public static String  invertePalavra (String palavra)  {
		// •O método invertePalavra recebe um String e retorna o String invertido. 
		
		int x = palavra.length();
		String inversao = null;
		
		while (x>=0) {
			inversao = inversao + palavra.charAt(x);
		}
		
	
		return inversao;
	}
}
