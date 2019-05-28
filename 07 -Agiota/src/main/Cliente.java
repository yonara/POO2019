package main;
public class Cliente {
	
	private String nomeCompleto;
	private String id;
	private float saldo;
	
	public Cliente(String id, float saldo, String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
		this.id = id;
		this.saldo = saldo;		
		
		
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
