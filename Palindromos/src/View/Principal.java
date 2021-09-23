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
		 Esse  novo  projeto irá  receber  uma  cadeia  de  Strings  do  usuário  e  demonstrar  para  ele  se  essa  palavra se trata ou não de um Palíndromo.
		 A classe PalindromoController no package controller deve ter 2 métodos:
		 •O método invertePalavra que recebe um String e retorna o String invertido. Os métodos push(), pop(), isEmpty() devem ser usados para esse fim; 
		 •O método comparaPalavras, que recebe o String, o String já invertido e retorna um boolean (True para Palíndromo e False para Não Palíndromo)
		 
		 A classe Principal, no package view, no seu método Main, deve 
		 inicializar uma pilha e 
		 exibir a possibilidade de o usuário inserir uma cadeia de Strings e retornar a ele se é ou não um palíndromo. 
		 
		 Todos os métodos devem receber a pilha criada no método Main como parâmetro.
		 
		 Dica: Para inverter, pode-se usar os métodos substring ou charAt*/
		
		System.out.println("escolha uma das opções:"
				+ "/n 1- adicionar uma nova string"
				+ "/n 2- checar palíndromo"
				+ "/n 9- fechar programa");
		
		
		
		boolean rodando=true;
		
		while (rodando) {
			switch (input.nextInt()) {
			case 1:
				System.out.println("Insira a palavra a ser adicionada à pilha");
				pilhaPalindromos.push(input.next());
				break;
			case 2:
				try {
					String palavra = pilhaPalindromos.pop();
					String arvalap = PalindromoController.invertePalavra(palavra);
					if (PalindromoController.comparaPalavras(palavra, arvalap)==true) {
						System.out.println("A palavra inserida é um palíndromo!");
					}
					else
					{
						System.out.println("A palavra inserida NÃO é um palíndromo!");
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
				System.err.println("opção inválida");
			}
		}
		input.close();
		
		
		
	}

}
