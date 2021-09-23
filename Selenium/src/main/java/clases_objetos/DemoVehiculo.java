package clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		
		Vehiculo minivan = new Vehiculo();
		int rango;
		
		//Asiganando valores a las varibales de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calculo de rando asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con rango de " + rango + " kilometros");
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numeros en pasajeros en carro es: " + carro.pasajeros);

	}

}
