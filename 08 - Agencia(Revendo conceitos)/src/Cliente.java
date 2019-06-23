public class Cliente {
	private int id;
	private String nome;
	
	public Cliente(int id, String nome) {
		this.setNome(nome);
		this.setId(id);				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
