package main;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private int idGerador;
	private float saldo;
	private List<Cliente> clientes;
	private List<Transacao> transacoes;
	
	
	public Sistema (float saldo) {
		this.saldo = saldo;
		this.clientes = new ArrayList<>();
		this.transacoes = new ArrayList<>();
		this.idGerador = 0;
	}

	
	
	public void AddCli (String IdCli, String nome ) {
		Cliente cliente = new Cliente(IdCli,0, nome);
		this.clientes.add(cliente);// adicionando cliente na lista
		
		
	}
	
	public void mostrarHistorico() {
		
	}
	
	public void mostrarCliente() {
		
	}
	
	public void emprestarDinheiro() {
		
	}
	
	public void receberDinheiro() {
		
	}
	
	public void matarCliente() {
		
	}
	
	
}
