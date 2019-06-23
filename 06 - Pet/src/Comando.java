import java.util.Scanner;

public class Comando {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet tamagotchi = new Pet(" ",0,0,0);
        System.out.println("1 = Sair ");
        System.out.println("2 = Colocar o Nome; Energia; Saciedade; Limpeza" );
        System.out.println("3 = Mostrar PET");
        System.out.println("_________________________________________________________");
        System.out.println("(play)---"+ "---(dormir)---"+"---(banho)---"+"---(comer)");

        while (true){
            String line = sc.nextLine();
            String [] ui= line.split(" ");
                if (ui[0].equals("1")) {
                	System.out.println("Bay");
                    break;
                }else if(ui[0].equals("2")){
                    tamagotchi = new Pet(ui[1],
                            Integer.parseInt(ui[2]),
                            Integer.parseInt(ui[3]),
                            Integer.parseInt(ui[4]));
                    
                }else if(ui[0].equals("3")) {
                    System.out.println(tamagotchi);
                }else if(ui[0].equals("play")) {
                    tamagotchi.play();
                }else if(ui[0].equals("dormir")) {
                	tamagotchi.dormir();
                }else if (ui[0].equals("banho")) {
                	tamagotchi.banho();
                }else if (ui[0].equals("comer")) {
                	tamagotchi.comer();
                	
                }else {
                    System.out.println("comando invalido");

                }
           }

        }

    }
                        
                	
                           