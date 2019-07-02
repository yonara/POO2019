import java.util.ArrayList;

public class Tweet {

    public static int idCount= 0;
    private int id;
    private String usuarioTweet;
    private String mensagem;

    ArrayList<String> curtidas = new ArrayList<>();
    ArrayList<String> comentarios = new ArrayList<>();

    public Tweet(String usuarioTweet, String mensagem){
        this.usuarioTweet = usuarioTweet;
        this.mensagem = mensagem;
        this.id = idCount;
        idCount++;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void darLike(String username){
        curtidas.add(username);
    }
	public String toString() {
		String saida = "[ ";
        for(String curtidasUser : curtidas){
            saida += curtidasUser + " ";
        }
        String curtidas = saida + "]";
        return this.id + ":" + this.usuarioTweet + "( " + this.mensagem + " )" + curtidas;
    	}

}
  
    
    