package br.gov.prodegem.projetodesk.persistencia;

import java.util.UUID;

import br.gov.prodegem.projetodesk.entidades.Cliente;

public class ClienteDAO {

	public Cliente salvar(Cliente cliente) {
		String uuid = UUID.randomUUID().toString();
		cliente.setId(uuid);
		ConcessionariaBaseDados.getInstancia().getClientes().put(uuid, cliente);
		
		return cliente;
	}
	
	public Cliente atualizar(Cliente cliente) {
		Cliente clienteRecuperado = ConcessionariaBaseDados.getInstancia().getClientes().get(cliente.getId());
		
		if (clienteRecuperado != null) {
			if (cliente.getNome() != null && !cliente.getNome().trim().equals("")) {
				clienteRecuperado.setNome(cliente.getNome());
			}
			
			if (cliente.getCpf() != null && !cliente.getCpf().trim().equals("")) {
				clienteRecuperado.setCpf(cliente.getCpf());
			}
			
			if (cliente.getDataDeNascimento() != null && !cliente.getDataDeNascimento().trim().equals("")) {
				clienteRecuperado.setDataDeNascimento(cliente.getDataDeNascimento());
			}
			
			if (cliente.getEndereco() != null && !cliente.getEndereco().trim().equals("")) {
				clienteRecuperado.setEndereco(cliente.getEndereco());
			}
			
			return clienteRecuperado;
		}
		
		return null;
	}
	
	public Cliente pesquisar(String id) {
		Cliente cliente = ConcessionariaBaseDados.getInstancia().getClientes().get(id);
		
		if (cliente != null) {
			return cliente;
		}
		
		return null;
	}
	
	public void excluir(String id) {		
		ConcessionariaBaseDados.getInstancia().getClientes().remove(id);
	}
	
}
