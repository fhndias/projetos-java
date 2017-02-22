package br.gov.prodegem.projetodesk.entidades;


public class Cliente {
	private String id;
	private String cpf;
	private String nome;
	private String dataDeNascimento;
	private String endereco;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeAniversario) {
		this.dataDeNascimento = dataDeAniversario;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
}
