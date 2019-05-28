import java.util.Scanner;
public class Carro{ //Classe
	int tanque; 
	int maxGas;
	int qtdPas;
	int maxPas;
	int km;

	public Carro(){ //Construtor
		maxGas = 10;
		tanque = 0;
		qtdPas = 0;
		maxPas = 2;
		km = 0;
	}
	public void mostrar(){
		
		System.out.println("pass: "+qtdPas +", gas: "+ tanque +", km: "+km );
	
	}
	
	
	public void embarcar(){
		if (qtdPas <= maxPas){
			qtdPas +=1;		
			
		}else{
			System.out.println("fail: limite de pessoas atingido");
		}
		
	}
	public void desembarcar() {
		if (qtdPas > 0){
			qtdPas -=1;	
		}else {
			System.out.println("fail: nao ha ninguem no carro");
		}		
	}
	
	public void abastecer(int qtdgasolina) {
		if(tanque < maxGas) {
			tanque = tanque + qtdgasolina;
			if (tanque > maxGas) {
				tanque = maxGas;
				
			}
		}else{
			System.out.println("Tanque cheio");
		}
	}
	
	public void dirigir(int qtdKm){
		int gastoGas;
		gastoGas= qtdKm/10;
		
		if((qtdPas > 0)&&(gastoGas <= tanque)){
			tanque = tanque - gastoGas;
			km = km + gastoGas;
			
		}else if(gastoGas > tanque){
			System.out.println("fail: gasolina insuficiente");
			
		}else {
			System.out.println("fail: nao ha ninguem no carro");
			
		}
				
	}
			
	public static void main(String[] args){ 
		Carro car = new Carro(); // Criando um objeto
		car.mostrar(); // chamando a função mostrar		
		
		Scanner input = new Scanner(System.in);
		boolean entrar = true;
		
		System.out.println("mostrar,"+"embarcar,"+"desembarcar,"+"abastecer,"+"dirigir");
		while (entrar) { // testanto de é verdadeiro (entrar = true)
			
			
			String linha = input.nextLine();
			String[] comando = linha.split(" ");
			String op = comando[0];
			if(op.equals("embarcar")){
				car.embarcar();
			}else if(op.equals("mostrar")) {
				car.mostrar();
				
			}else if(op.equals("desembarcar")) {
				car.desembarcar();
				
			}else if(op.equals("abastecer")) {
				int qtdgasolina = Integer.parseInt(comando[1]);
				car.abastecer(qtdgasolina);
	
			}else if(op.equals("dirigir")) {
				int qtdKm = Integer.parseInt(comando[1]);
				car.dirigir(qtdKm);
				
			}else if(op.equals("sair")) {
				entrar = false;
			}
			
		}
		
	}
	
	
}
