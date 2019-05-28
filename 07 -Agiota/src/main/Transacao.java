package main;
public class Transacao {
	private String cliente;
	private float valor;
	private int identificador;
	
	public Transacao(String cliente, float valor, int identificador) {
		this.cliente = cliente;
		this.valor = valor;
		this.identificador = identificador;
		
		
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	

}
