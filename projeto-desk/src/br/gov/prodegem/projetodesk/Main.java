package br.gov.prodegem.projetodesk;

import java.util.Scanner;

import br.gov.prodegem.projetodesk.entidades.Cliente;

public class Main {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("+=================== Meu Sistema ===================+");
		System.out.println("=              1 - Cadastro de Cliente              =");
		System.out.println("=              2 - Cadastro de Carro                =");
		System.out.println("+===================================================+");
		System.out.println("Informe a opção: ");
		
		String opcao = scanner.nextLine();
		
		if (opcao.equals("1")) {
			cadastroDeCliente();
		}
		
		scanner.close();
	}
	
	private static void cadastroDeCliente() {
		System.out.println("========== Cadastro de Cliente ==========");
		Scanner scanner = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		
		System.out.println("Informe o nome: ");
		String nome = scanner.nextLine();
		cliente.setNome(nome);
		
		System.out.println("Informe o CPF: ");
		String cpf = scanner.nextLine();
		cliente.setCpf(cpf);
		
		System.out.println("Infome a data de nascimento: ");
		String dataDeNascimento = scanner.nextLine();
		cliente.setDataDeAniversario(dataDeNascimento);
		
		System.out.println("Informe o endereço: ");
		String endereco = scanner.nextLine();
		cliente.setEndereco(endereco);
		
		System.out.println();
		System.out.println("Cliente cadastrado: ");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Data de nascimento: " + cliente.getDataDeAniversario());
		System.out.println("Endereço: " + cliente.getEndereco());
		
	
		scanner.close();
	}
}	
