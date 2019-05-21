public class ContaPoupanca extends Conta {
	private double tarifa = 0.01;
	
	public ContaPoupanca(int id, Cliente cliente) {
		super(id, cliente);
	}

	@Override
	public void update() {
		double saldo = super.getSaldo();
		setSaldo(saldo + (saldo * this.tarifa));
	}
	
	@Override
	public String toString() {
		return super.getId()+":" + super.getCliente().getNome() + ":" +super.getSaldo()+ ":CP";
	}
}
