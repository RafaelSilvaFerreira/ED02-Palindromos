package View;

import java.util.Scanner;

import Controller.PalindromoController;
import br.com.leandrocolevati.pilhastring.Pilha;

public class Principal {
	public static void main(String args[]) {
		Pilha pilhaPalindromos = new Pilha();
		Scanner input = new Scanner(System.in);
		
		/*
		 Criar  um  projeto  Java  (Palindromos)  e  importe  a  biblioteca  PilhaStrings.  
		 Esse  novo  projeto ir�  receber  uma  cadeia  de  Strings  do  usu�rio  e  demonstrar  para  ele  se  essa  palavra se trata ou n�o de um Pal�ndromo.
		 A classe PalindromoController no package controller deve ter 2 m�todos:
		 �O m�todo invertePalavra que recebe um String e retorna o String invertido. Os m�todos push(), pop(), isEmpty() devem ser usados para esse fim; 
		 �O m�todo comparaPalavras, que recebe o String, o String j� invertido e retorna um boolean (True para Pal�ndromo e False para N�o Pal�ndromo)
		 
		 A classe Principal, no package view, no seu m�todo Main, deve 
		 inicializar uma pilha e 
		 exibir a possibilidade de o usu�rio inserir uma cadeia de Strings e retornar a ele se � ou n�o um pal�ndromo. 
		 
		 Todos os m�todos devem receber a pilha criada no m�todo Main como par�metro.
		 
		 Dica: Para inverter, pode-se usar os m�todos substring ou charAt*/
		
		System.out.println("escolha uma das op��es:"
				+ "/n 1- adicionar uma nova string"
				+ "/n 2- checar pal�ndromo"
				+ "/n 9- fechar programa");
		
		
		
		boolean rodando=true;
		
		while (rodando) {
			switch (input.nextInt()) {
			case 1:
				System.out.println("Insira a palavra a ser adicionada � pilha");
				pilhaPalindromos.push(input.next());
				break;
			case 2:
				try {
					String palavra = pilhaPalindromos.pop();
					String arvalap = PalindromoController.invertePalavra(palavra);
					if (PalindromoController.comparaPalavras(palavra, arvalap)==true) {
						System.out.println("A palavra inserida � um pal�ndromo!");
					}
					else
					{
						System.out.println("A palavra inserida N�O � um pal�ndromo!");
					}
				} catch (Exception e) {
					System.out.println("Pilha vazia!");
					e.printStackTrace();
				}
				
				break;
			case 9:
				rodando=false;
				break;
			default:
				System.err.println("op��o inv�lida");
			}
		}
		input.close();
		
		
		
	}

}
