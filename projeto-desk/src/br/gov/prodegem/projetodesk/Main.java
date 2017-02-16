package br.gov.prodegem.projetodesk;

import java.util.Scanner;

import br.gov.prodegem.projetodesk.entidades.Carro;

public class Main {
	public static void main(String[] args) {			
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
