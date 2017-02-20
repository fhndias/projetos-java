package br.gov.prodegem.projetodesk;

import java.util.Scanner;

import br.gov.prodegem.projetodesk.entidades.Cliente;

import br.gov.prodegem.projetodesk.entidades.Carro;

public class Main {
	public static void main(String[] args) {		
		String opcao = "";
		
		while (!opcao.equals("3")) {
			System.out.println("+=================== Meu Sistema ===================+");
			System.out.println("=              1 - Cadastro de Cliente              =");
			System.out.println("=              2 - Cadastro de Carro                =");
			System.out.println("=              3 - Sair                             =");
			System.out.println("+===================================================+");
			System.out.println("Informe a opção: ");			
			
			Scanner scanner = new Scanner(System.in);
 	        opcao = scanner.nextLine();
 	        
			
			if (opcao.equals("1")) {
				cadastroDeCliente();
			} else if (opcao.equals("2")) {
				cadastroDeCarro();	
			}
			
			scanner.close();
		}
		
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
	
	private static void cadastroDeCarro() {
		System.out.println("========== Cadastro de Carro ==========");
		Scanner scanner = new Scanner(System.in);
		
		Carro carro = new Carro();
		carro.setId(1L);
		
		System.out.println("Informe o modelo: ");
		String modelo = scanner.nextLine();
		carro.setModelo(modelo);
		
		System.out.println("Informe a montadora: ");
		String montadora = scanner.nextLine();
		carro.setMontadora(montadora);
		
		System.out.println("Informe a placa: ");
		String placa = scanner.nextLine();
		carro.setPlaca(placa);
		
		System.out.println("Informe o ano: ");
		String ano = scanner.nextLine();
		carro.setAno(ano);
		
		System.out.println();
		System.out.println("Carro cadastrado: ");
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Montadora: " + carro.getMontadora());
		System.out.println("Placa: " + carro.getPlaca());
		System.out.println("Ano: " + carro.getAno());
		
		
		scanner.close();
	}
}	
