package br.gov.prodegem.projetodesk;

import java.util.Scanner;

import br.gov.prodegem.projetodesk.entidades.Cliente;
import br.gov.prodegem.projetodesk.persistencia.ClienteDAO;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {			
		String opcao = "0";		
		
		while (!opcao.equals("5")) {
			System.out.println("+=================== Meu Sistema ===================+");
			System.out.println("=              1 - Cadastro de Cliente              =");
			System.out.println("=              2 - Cadastro de Carro                =");
			System.out.println("=              3 - Empr�stimo de Carro              =");
			System.out.println("=              4 - Devolu��o de Carro               =");
			System.out.println("=              5 - Sair                             =");
			System.out.println("+===================================================+");
			System.out.println("+===== Informe a op��o: ");			
			
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
		System.out.println("========== Cadastro de Cliente ==========");
		
		Cliente cliente = new Cliente();
		
		System.out.println("Informe o nome: ");
		String nome = scanner.nextLine();
		cliente.setNome(nome);
		
		System.out.println("Informe o CPF: ");
		String cpf = scanner.nextLine();
		cliente.setCpf(cpf);
		
		System.out.println("Infome a data de nascimento: ");
		String dataDeNascimento = scanner.nextLine();
		cliente.setDataDeNascimento(dataDeNascimento);
		
		System.out.println("Informe o endere�o: ");
		String endereco = scanner.nextLine();
		cliente.setEndereco(endereco);
		
		ClienteDAO dao = new ClienteDAO();
		cliente = dao.salvar(cliente);
		
		System.out.println();
		System.out.println("Cliente cadastrado: ");
		System.out.println("Id: " + cliente.getId());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Data de nascimento: " + cliente.getDataDeNascimento());
		System.out.println("Endere�o: " + cliente.getEndereco());
		System.out.println("");
	}
	
	private static void cadastroDeCarro() {
		System.out.println("Cadastro de Carro...");
	}
	
	private static void realizarEmprestimoDeCarro() {
		System.out.println("Realizando empr�stimo...");
	}
	
	private static void realizarDevolucaoDeCarro() {
		System.out.println("Realizando devolu��o de carro...");
	}

}	
