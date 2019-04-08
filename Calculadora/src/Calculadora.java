import java.util.Scanner;

public class Calculadora {
	static int bateria;
	int bateriaMax;
	
	public Calculadora(){//construtor
		bateria = 0; 
		bateriaMax = 10;
	}
	public void mostraBateria(){//mostra a bateria
		System.out.println("bateria:"+bateria);
	}
	
	public void carga(int recarga){
		if(bateria < bateriaMax) {
			bateria = bateria + recarga;
			if(bateria > bateriaMax) {
				bateria = bateriaMax;
			}	
		}else {
			System.out.println("bateria cheia");
		}
		
	}

	public String soma (int v1,int v2) {
		return ""+(v1+v2);
    }
	public String divisao (int v1,int v2) {
		return ""+(v1/v2);
	}
	public String subtracao (int v1,int v2) {
		return ""+(v1-v2);
	}
	public String multiplicacao (int v1,int v2) {
		return ""+(v1*v2);
	}
	
	public static void main(String[] args){
		Calculadora calc = new Calculadora(); // Criando um objeto
		calc.mostraBateria(); // chamando a função mostrar	bateria
		
		Scanner entrada = new Scanner(System.in);
		boolean entrar = true;
		
		System.out.println("Iniciando Calculadora");
		while (entrar) { // testanto de é verdadeiro (entrar = true)
			
			String linha = entrada.nextLine();
			String[] comando = linha.split(" ");
			String op = comando[0];
			
			if(op.equals("recarga")) {
				int recarga = Integer.parseInt(comando[1]);
				calc.carga(recarga);
				continue;
			} else if (op.equals("mostrar")) {
				calc.mostraBateria();
				continue;
			}
			
			if (bateria <= 0) {
				System.out.println("bateria insuficiente! Regarregue para usar a calculadora");
				continue;
			}

			
			if (op.equals("soma")) {
				System.out.println("insira n1");
				int v1 = entrada.nextInt();
				System.out.println("insira n2");
				int v2 = entrada.nextInt();
				String resultado = calc.soma(v1, v2);
				System.out.println(resultado);
				bateria -=1;		
			
			}else if (op.equals("divisao")) {
				System.out.println("insira n1");
				int v1 = entrada.nextInt();
				System.out.println("insira n2");
				int v2 = entrada.nextInt();
				String resultado = calc.divisao(v1, v2);
				System.out.println(resultado);
			
			}else if (op.equals("subtracao")) {
				System.out.println("insira n1");
				int v1 = entrada.nextInt();
				System.out.println("insira n2");
				int v2 = entrada.nextInt();
				String resultado = calc.subtracao(v1, v2);
				System.out.println(resultado);
			
			}else if (op.equals("multiplicacao")) {
				System.out.println("insira n1");
				int v1 = entrada.nextInt();
				System.out.println("insira n2");
				int v2 = entrada.nextInt();
				String resultado = calc.multiplicacao(v1, v2);
				System.out.println(resultado);
			}
		}
	}
}	
	
	
		


	
