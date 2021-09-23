package arreglos;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		//Ambas son declaraciones validas.
		int intArray[];
		int[] intArray2;
		
		//Declarar un array de strings.
		String[] arr;
		//asignar memoria para 5 enteros
		arr = new String[5];
		
		//incializa el primer elemento del array
		arr[0] = "cero";
		
		//incializa el segundo elemento del array
		arr[1] = "uno";
		
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//System.out.println("Elemento en el indice 2: " + arr[1]);
		
		for(int i = 0; i < arr.length;i++) {//arr.lenght calcula la longitus del arreglo
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}

	}

}
