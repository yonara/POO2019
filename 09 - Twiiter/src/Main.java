import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
	    Sistema sistema = new Sistema();
		System.out.println("1 - Para adicionar usuario");
		System.out.println("2 - Seguir");
		System.out.println("3 - Postar ");
		System.out.println("4 - Curtir usuario _idTweet");
		System.out.println("5 - Ver perfil(timeline _usuario)");	
		System.out.println("show");
		System.out.println("end");
	    while(true){
	        String line = ler.nextLine();
	        String uInput[] = line.split(" ");

	        if(uInput[0].equals("end")){
	            break;
            }
	        
	        else if(uInput[0].equals("1")){
	            sistema.addUsuario(uInput[1]);
            }
	        else if(uInput[0].equals("2")){
	            sistema.seguirUsuario(uInput[1], uInput[2]);
            }
	        else if(uInput[0].equals("3")){
	        	String[] subarray = Arrays.copyOfRange(uInput, 2, uInput.length);
	        	String mensagem = String.join(" ", subarray);
	            sistema.userTweetar(uInput[1], mensagem);
            }
	        else if(uInput[0].equals("4")){
	            sistema.darLike(uInput[1], Integer.parseInt(uInput[2]));
            }
	        else if(uInput[0].equals("timeline")){
	        	sistema.verTimeline(uInput[1]);
			}
	        else if(uInput[0].equals("show")){
	        	sistema.mostraUsuarios();
			}
	        else{
                System.out.println("Digite um comando valido");
	        }
	    	}
    	}
    }
    

