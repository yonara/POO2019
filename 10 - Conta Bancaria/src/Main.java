import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Conta conta = new Conta();
        
        System.out.println("_______________iniciando sistema______________ ");
        System.out.println("1 - Para depositar (Digite num e valor)");
        System.out.println("2 - Paa Sacar ");
        System.out.println("3 - Para extornar ");
        System.out.println("4 - Para Mostrar ");
        while(true){
            String line = ler.nextLine();
            String uInput[] = line.split(" ");

            if(uInput[0].equals("1")){
                conta.depositar(Float.parseFloat(uInput[1]));
                conta.retornaExtrato();
            }
            else if(uInput[0].equals("2")){
                conta.sacar(Float.parseFloat(uInput[1]));
                conta.retornaExtrato();
            }
            else if(uInput[0].equals("3")){
                conta.extorno(Integer.parseInt(uInput[1]));
            }
            else if(uInput[0].equals("4")){
                conta.retornaExtrato();
            }
            else{
                System.out.println("Comando invalido");
            }
        }
    }
}