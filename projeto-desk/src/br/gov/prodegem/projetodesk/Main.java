package br.gov.prodegem.projetodesk;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {			
		String opcao = "0";
		Scanner scanner = new Scanner(System.in);
		
		while (!opcao.equals("5")) {
			System.out.println("+=================== Meu Sistema ===================+");
			System.out.println("=              1 - Cadastro de Cliente              =");
			System.out.println("=              2 - Cadastro de Carro                =");
			System.out.println("=              3 - Empréstimo de Carro              =");
			System.out.println("=              4 - Devolução de Carro               =");
			System.out.println("=              5 - Sair                             =");
			System.out.println("+===================================================+");
			System.out.println("+===== Informe a opção: ");			
			
 	        opcao = scanner.nextLine(); 	        
 	        
			if (opcao.equals("1")) {
				cadastroDeCliente();				
			} else if (opcao.equals("2")) {
				cadastroDeCarro();
			} else if (opcao.equals("3")) {
				realizarEmprestimoDeCarro();
			} else if (opcao.equals("4")) {
				realizarDevolucaoDeCarro();
			}
			
		}
		
		scanner.close();
	}
	
	private static void cadastroDeCliente() {
		System.out.println("Cadastro de Cliente...");
	}
	
	private static void cadastroDeCarro() {
		System.out.println("Cadastro de Carro...");
	}
	
	private static void realizarEmprestimoDeCarro() {
		System.out.println("Realizando empréstimo...");
	}
	
	private static void realizarDevolucaoDeCarro() {
		System.out.println("Realizando devolução de carro...");
	}

}	
