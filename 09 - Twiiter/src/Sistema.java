import java.util.ArrayList;

public class Sistema {
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void addUsuario(String username){
        Usuario u = new Usuario(username);
        usuarios.add(u);
    }
    public void mostraUsuarios(){
        for(Usuario user : usuarios){
            System.out.println(user + "\n");
        }
    }

    public Usuario retornaUsuario(String nome){
        for(Usuario user: usuarios){
            if(user.getUsuario().equals(nome)){
                return user;
            }
        }
        return null;
    }
    
    public void seguirUsuario(String nome, String nome2){
        for(Usuario user : usuarios){
            if(user.getUsuario().equals(nome)){
                user.seguir(retornaUsuario(nome2));
            }
        }
    }
    public void userTweetar(String nome, String mensagem){
        retornaUsuario(nome).tweetar(new Tweet(nome, mensagem));
    }
    public void verTimeline(String nome){
        retornaUsuario(nome).lerTimeline();
    }
    public void darLike(String nome, int idTweet){
        retornaUsuario(nome).darLike(idTweet);
    }
}
    
    
    