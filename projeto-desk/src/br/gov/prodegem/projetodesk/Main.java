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
			System.out.println("=              3 - Empréstimo de Carro              =");
			System.out.println("=              4 - Devolução de Carro               =");
			System.out.println("=              5 - Sair                             =");
			System.out.println("+===================================================+");
			System.out.println("+===== Informe a opção: ");			
			
 	        opcao = scanner.nextLine(); 	        
 	        
			if (opcao.equals("1")) {
				apresentarMenuCliente();				
			} else if (opcao.equals("2")) {

			} else if (opcao.equals("3")) {

			} else if (opcao.equals("4")) {

			}
			
		}
		
		scanner.close();
	}
	
	private static void apresentarMenuCliente() {
		String opcao = "0";		
		
		while (!opcao.equals("5")) {
			System.out.println("+===================   Cliente   ===================+");
			System.out.println("=              1 - Cadastrar Cliente                =");
			System.out.println("=              2 - Atualizar Cliente                =");
			System.out.println("=              3 - Pesquisar Cliente                =");
			System.out.println("=              4 - Excluir Cliente                  =");
			System.out.println("=              5 - Voltar                           =");
			System.out.println("+===================================================+");
			System.out.println("+===== Informe a opção: ");			
			
 	        opcao = scanner.nextLine(); 	        
 	        
			if (opcao.equals("1")) {
				cadastrarCliente();			
			} else if (opcao.equals("2")) {
				atualizarCliente();
			} else if (opcao.equals("3")) {
				pesquisarCliente();
			} else if (opcao.equals("4")) {
				excluirCliente();
			}
			
		}
	}
	
	private static void cadastrarCliente() {
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
		
		System.out.println("Informe o endereço: ");
		String endereco = scanner.nextLine();
		cliente.setEndereco(endereco);
		
		ClienteDAO dao = new ClienteDAO();
		cliente = dao.salvar(cliente);
		
		System.out.println("Id: " + cliente.getId());
	}
	
	private static void atualizarCliente() {
		System.out.println("Informe o id: ");
		String id = scanner.nextLine();
		
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = dao.pesquisar(id);
		
		System.out.println("Informe o nome: ");
		String nome = scanner.nextLine();
		cliente.setNome(nome);
		
		System.out.println("Informe o CPF: ");
		String cpf = scanner.nextLine();
		cliente.setCpf(cpf);
		
		System.out.println("Infome a data de nascimento: ");
		String dataDeNascimento = scanner.nextLine();
		cliente.setDataDeNascimento(dataDeNascimento);
		
		System.out.println("Informe o endereço: ");
		String endereco = scanner.nextLine();
		cliente.setEndereco(endereco);
		
		cliente = dao.atualizar(cliente);
	}
	
	private static void pesquisarCliente() {
		System.out.println("Informe o id do cliente: ");
		String id = scanner.nextLine();
		
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = dao.pesquisar(id);
		
		if (cliente != null) {
			System.out.println("Id: " + cliente.getId());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Data de Nascimento: " + cliente.getDataDeNascimento());
			System.out.println("Endereço: " + cliente.getEndereco());
		} else {
			System.out.println("Cliente não encontrado!");
		}
	}
	
	private static void excluirCliente() {
		System.out.println("Informe o id do cliente: ");
		String id = scanner.nextLine();
		
		ClienteDAO dao = new ClienteDAO();
		dao.excluir(id); 
	}

}	
