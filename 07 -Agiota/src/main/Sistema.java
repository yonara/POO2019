package main;

import java.util.ArrayList;

public class Sistema {
	ArrayList<Cliente> clientes;
	ArrayList<Transacao> tr;
	float saldo;
	int count;
	
	public Sistema(float saldo) {
		this.saldo = saldo;
		this.clientes = new ArrayList<Cliente>();
		this.tr = new ArrayList<Transacao>();
		this.count = 0;	
	}
	public String toString() {
		String saida = " ";
		for (Cliente cliente : clientes) {
			saida += cliente +"\n";
		}	
			return saida+"Saldo: "+ this.saldo + "\n";
	}
	public void cadastrar(Cliente cli) {
		if(this.encontrarClientes(cli.id) != null) {
			System.out.println("Id ja cadastrado");
			return;
		}
		clientes.add(cli);
	}
	
	public Cliente encontrarClientes(String id){
		for(Cliente cli : clientes) {
			if(cli.id.equals(id)) {
				return cli;
			}
		}
		return null;
	}
	public void emprestar(String id, float valor) {
		Cliente cli = encontrarClientes(id);
		if(cli == null) {
			System.out.println("cliente n�o existente");
			return;
		}
		if(this.saldo < valor) {
			System.out.println(" valor indispon�vel ");
			return;
		}
		this.tr.add(new Transacao(count,-valor,id));
		count+=1;
		this.saldo -= valor;
		cli.saldo += valor;
	}	
	ArrayList<Transacao>historico() {
        return tr;
    }
	public void mostrarCliente(String id) {
		for(Cliente c : clientes ){
			if(c.id.equals(id)) {
				System.out.println(tr);		
			}
			System.out.println("cliente n�o cadastrado");
			return;
		}
	}	
	public void receber(String id, int valor) {
			Cliente cli =  encontrarClientes(id);
			if(cli == null) {
				System.out.println("cliente n�o cadastrado");
				return; 
			}
			if(valor > cli.saldo) {
				System.out.println(" fail: valor maior que a divida");
					return;
			}
			cli.saldo -= valor;
			this.saldo += saldo;
		}	
	public void matar(String id) {
		Cliente cli = encontrarClientes(id);
		this.clientes.remove(cli);
		this.tr.remove(cli);
		return;
	}
}