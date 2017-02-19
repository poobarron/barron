package manejador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MString obj = new MString();
		System.out.println("numero de repeticiones:" + obj.numero_de_incidencias("anita lava la tina", 'A'));
		System.out.println("numero de digitos:" + obj.cantidad_de_digitos("anita lava la tina 1234567890 /"));
	}

}
