package encapsulacion;

public class DemoEncap {

	public static void main(String[] args) {
		ClaseEncap encap = new ClaseEncap();
		
		encap.setTipo(10);
		
		System.out.println("El tipo es: " + encap.getTipo());
	}

}
