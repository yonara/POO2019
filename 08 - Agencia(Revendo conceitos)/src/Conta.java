public abstract class Conta {
	private int id;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int id, Cliente cliente) {
		this.cliente = cliente;
		this.id = id;
		this.saldo = 0;		
	}
	
	public boolean sacar (double valor) {
		if( valor <= saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;		
	}
	
	public void depositar(double valor) {
		this.saldo += valor;				
	}
	
	public abstract void  update();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
