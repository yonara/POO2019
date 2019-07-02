public class Cliente {

	String nome;
	int idade;
	
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	public String toString() {
		return "" + this.nome+":"+ this.idade;
		
	}
	public boolean prioridade() {
		return idade <= 60;
	}
	
	
}
