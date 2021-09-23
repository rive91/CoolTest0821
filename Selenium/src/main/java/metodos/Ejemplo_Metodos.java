package metodos;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		int resultado = suma(5,9);
		System.out.println(resultado);
		
		int resultado2 = suma(10,9);
		System.out.println(resultado2);
		
		int resultado3 = suma(5,66);
		System.out.println(resultado3);
		
		String carros = carro(2);
		System.out.println(carros);
		
		int resultadoSuma = suma(5,9,60);
		System.out.println(resultadoSuma);
	}
	
	public static int suma(int a,int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a,int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW","Ford","Mazda"};
		return cars[a];
	}

}
