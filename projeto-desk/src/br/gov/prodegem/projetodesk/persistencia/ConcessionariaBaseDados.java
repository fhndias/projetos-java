package br.gov.prodegem.projetodesk.persistencia;

import java.util.HashMap;
import java.util.Map;

import br.gov.prodegem.projetodesk.entidades.Cliente;

public class ConcessionariaBaseDados {
	private static ConcessionariaBaseDados instancia;
	private Map<String, Cliente> clientes;	
	
	private ConcessionariaBaseDados() {
		clientes = new HashMap<String, Cliente>();
	}
	
	public static ConcessionariaBaseDados getInstancia() {
		if (instancia == null) {
			instancia = new ConcessionariaBaseDados();
		}
		
		return instancia;
	} 

	public Map<String, Cliente> getClientes() {
		return clientes;
	}	
	
}
