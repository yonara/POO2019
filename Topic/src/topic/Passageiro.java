package topic;

import java.util.ArrayList;

public class Passageiro {
	
	String nome;
	int idade;
	
	public Passageiro(String nome, int idade){ //Contrutor - Criando passageiro
		this.nome = nome;
		this.idade = idade;
	}
	
	public  String toString(){
		
		return "" + this.nome+":"+ this.idade;		
	}
	
	public boolean prioridade() {
		return idade <= 60;
	}
}
	
class Topic { 
	ArrayList <Passageiro>banco;
	int prioridade;
	
	public Topic(int prioridade, int capacidade) { // Criando a topic
		banco = new ArrayList <Passageiro>();
		for (int i = 0; i < capacidade; i++) {
			banco.add(null);
			
		}
		
		this.prioridade = prioridade;
		   
	 }

	    public String toString() {
	        String saida = "[";
	        for (int i = 0; i < banco.size(); i++) {
	            if (i < prioridade)
	                saida += "@";
	            else
	                saida += "=";
	            if (banco.get(i) != null)
	                saida += banco.get(i);
	        }
	     
	        return saida + " ]";
	       
	    }
	    
	    private boolean inserirpass(int inicio, int fim, Passageiro pass) {
	        for (int i = inicio; i < fim; i++) {
	            if (banco.get(i) == null) {
	                banco.set(i, pass);
	                return true;
	            }
	        }
	        return false;
	    }

	    public void inserirpass(Passageiro pass) {
	        if (pass.prioridade()) {
	            inserirpass(0, this.banco.size(),pass);
	        } else {
	            if (!inserirpass(this.prioridade, this.banco.size(), pass))
	                inserirpass(0, this.prioridade, pass);
	        }
	    }

	    boolean removerpass (String id){
	        for (int i = 0; i < banco.size(); i ++) {
	            if (banco.get(i).nome != null) {
	                if (banco.get(i).nome.equals(id)){
	                    banco.set(i, null);
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	}
	    
	    




	
	

	
	

		


