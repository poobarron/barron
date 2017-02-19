package manejador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MString obj = new MString();
		System.out.println("numero de repeticiones:" + obj.numero_de_incidencias("anita lava la tina", 'A'));
		System.out.println("numero de digitos:" + obj.cantidad_de_digitos("anita lava la tina 1234567890 /"));
		System.out.println("es par?:" + obj.es_par(10));
		System.out.println("es par?:" + obj.es_par(2));
		System.out.println("es decimal?:" + obj.es_decimal(2.0));
		System.out.println("es primo?:" + obj.es_primo(7));
		System.out.println(obj.numero_a_letras(10));
	}

}
