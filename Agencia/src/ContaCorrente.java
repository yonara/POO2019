public class ContaCorrente extends Conta{
	private double juros = 20;

	public ContaCorrente(int id, Cliente cliente) {
		super(id, cliente);
	}

	@Override
	public void update() {
		double saldo = getSaldo();
		setSaldo (saldo -= juros);
	}
	
	@Override
	public String toString() {
		return super.getId()+":" + super.getCliente().getNome() + ":" +super.getSaldo()+ ":CC";
	}
}
