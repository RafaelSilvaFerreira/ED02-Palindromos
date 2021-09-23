package Controller;

import br.com.leandrocolevati.pilhastring.Pilha;

public class PalindromoController {
	
	//A classe PalindromoController no package controller deve ter 2 m�todos:
				// �O m�todo comparaPalavras, que recebe o String, o String j� invertido e retorna um boolean (True para Pal�ndromo e False para N�o Pal�ndromo)
		 

	public static boolean comparaPalavras (String candidato,String otadidnac) {
		// �O m�todo comparaPalavras, que recebe o String e o String j� invertido 
		Boolean possivel= true;
		
		int x = 0;
		
		while (possivel && x<=candidato.length()) {
			possivel = candidato.charAt(x)==otadidnac.charAt(x);
			x++;
		}
			//retorna um boolean (True para Pal�ndromo e False para N�o Pal�ndromo)
		return possivel;
	}

	public static String  invertePalavra (String palavra)  {
		// �O m�todo invertePalavra recebe um String e retorna o String invertido. 
		
		int x = palavra.length();
		String inversao = null;
		
		while (x>=0) {
			inversao = inversao + palavra.charAt(x);
		}
		
	
		return inversao;
	}
}
