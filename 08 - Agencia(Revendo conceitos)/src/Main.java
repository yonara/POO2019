import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean end = false;
		Agencia agencia = new Agencia();
		Scanner input = new Scanner (System.in);
		
		while(!end) {
			String comando = input.nextLine();			
			String cmd [] = comando.split(" ");
			
			switch (cmd[0]) {
			case "addCli":
				agencia.addCli(cmd[1]);
				break;
			case "show":
				agencia.show();
				break;
			case "update":
				agencia.update();
				break;
			case "sacar":
				agencia.sacar(Integer.parseInt(cmd[1]), Double.parseDouble(cmd[2]));
				break;
			case "depositar":
				agencia.depositar(Integer.parseInt(cmd[1]), Double.parseDouble(cmd[2]));
				break;
			case "transf":
				agencia.transf(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), Double.parseDouble(cmd[3]));
				break;
			case "sair":
				end = true;
				break;
			default:
				System.out.println("Comando inválido!");
			}
		}
	}
}
