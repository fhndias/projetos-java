package br.gov.prodegem.projetodesk.controle;

import br.gov.prodegem.projetodesk.entidades.Cliente;
import br.gov.prodegem.projetodesk.persistencia.ClienteDAO;

public class ClienteControle {

	public Cliente salvar(Cliente cliente) {
		ClienteDAO dao = new ClienteDAO();
		cliente = dao.salvar(cliente);
		
		return cliente;
	}
	
	public Cliente atualizar(Cliente cliente) {
		ClienteDAO dao = new ClienteDAO();
		cliente = dao.atualizar(cliente);
		
		return cliente;
	}
	
	public Cliente pesquisar(String id) {
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = dao.pesquisar(id);
		
		return cliente;
	}
	
	
	public void excluir(String id) {
		ClienteDAO dao = new ClienteDAO();
		dao.excluir(id);
	}
}
