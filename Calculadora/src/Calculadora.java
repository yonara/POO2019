public class Calculadora {
	int bateria;
	int bateriaMax;

	
	public Calculadora(){//construtor
		bateria = 0; 
		bateriaMax = 10;
		}
	public void mostraBateria(){
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
	
	public static void main(String[] args){ 
		Calculadora calc = new Calculadora(); // Criando um objeto
		calc.mostraBateria(); // chamando a função mostrar	bateria
	}
}
