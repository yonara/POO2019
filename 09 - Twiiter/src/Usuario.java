import java.util.ArrayList;

public class Usuario {
    private String usuario;
    private int naoLidos;
    ArrayList<Tweet> timeline = new ArrayList<>();
    ArrayList<Tweet> meusTweets = new ArrayList<>();

    ArrayList<Usuario> seguidores = new ArrayList<>();
    ArrayList<Usuario> seguidos = new ArrayList<>();

    public Usuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void seguir(Usuario outro){
        for(Usuario usuario : seguidos){
            if(usuario.getUsuario().equals(outro.getUsuario())){
                return;
            }
        }
        this.seguidos.add(outro);
        outro.seguidores.add(this);
    }

    public void tweetar(Tweet tweet){
        meusTweets.add(tweet);
        for(Usuario seg : seguidores){
            seg.setNaoLidos(seg.getNaoLidos() + 1);
            seg.timeline.add(tweet);
        }
        this.timeline.add(tweet);
    }

    public void darLike(int idTweet){
        for(Tweet tweet : timeline){
            if(tweet.getId() == idTweet){
                tweet.darLike(this.usuario);
            }
        }
    }

    public void lerTimeline(){
        for(Tweet tweet : timeline){
            System.out.println(tweet);
        }
        this.setNaoLidos(0);
    }

    public String toString(){
        String saida1 = "[ ";
        for(Usuario user : seguidos){
            saida1 += user.getUsuario() + " ";
        }
        String seguidos = saida1 + "]";
        String saida2 = "[ ";
        for(Usuario user : seguidores){
            saida2 += user.getUsuario() + " ";
        }
        String seguidores = saida2 + "]";
        return this.usuario + "\nseguidos " + seguidos + "\nseguidores " + seguidores;
    }

	public int getNaoLidos() {
		return naoLidos;
	}

	public void setNaoLidos(int naoLidos) {
		this.naoLidos = naoLidos;
	}
}
