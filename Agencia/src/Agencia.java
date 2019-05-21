import java.util.ArrayList;
import java.util.List;

public class Agencia {
	private List<Cliente> clientes;
	private List<Conta> contas;
	private int clientId;
	private int contaId;
	
	
	public Agencia() {
		this.clientes = new ArrayList<>();
		this.contas = new ArrayList<>();
		this.clientId = 1;
	}
	
	public void addCli(String nome) {
		Cliente cliente = new Cliente(this.clientId++, nome);
		this.clientes.add(cliente);
		Conta cp = new ContaPoupanca (this.contaId++, cliente);
		this.contas.add(cp);
		Conta cc = new ContaCorrente (this.contaId++,cliente);
		this.contas.add(cc);				
	}
	
	public void show() {
		for(Conta conta: this.contas) {
			System.out.println(conta.toString());
		}	
	}
	
	public void transf(int idConta1, int idConta2, double valor) {
		Conta conta1 = this.buscarConta(idConta1);
		Conta conta2 = this.buscarConta(idConta2);
		
		if (conta1 != null && conta2 != null) {
			boolean sucesso = conta1.sacar(valor); 
			if(sucesso)
				conta2.depositar(valor);
			else
				System.out.println("Conta não tem saldo");
		} else {
			System.out.println("fail: conta não encontrada!");
		}
			
	}
	
	public void update() {
		for(Conta conta: this.contas) {
			conta.update();
		}
	}
	
	public void sacar(int idConta, double valor) {
		Conta conta = this.buscarConta(idConta);
		
		if (conta!=null) {
			boolean sucesso = conta.sacar(valor);
			if (!sucesso)
				System.out.println("Valor insuficiente!");
		} else {
			System.out.println("fail: conta não encontrada!");
		}
	}
	
	public void depositar(int idConta, double valor) {
		Conta conta = this.buscarConta(idConta);
				
		if (conta != null)
			conta.depositar(valor);
		else
			System.out.println("fail: conta não encontrada!");
	}
	
	public Conta buscarConta(int idConta) {
		for(Conta conta: this.contas) {
			if (conta.getId() == idConta) {
				return conta;
			}
		}
		return null;
	}
}
