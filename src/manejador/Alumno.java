package manejador;

public class Alumno {
	private String nombre;
	private double promedio;
	private char sexo;
	private String apellido;
	public Alumno(String nombre, double promedio, char sexo, String apellido) {
		super();
		this.nombre = nombre;
		this.promedio = promedio;
		this.sexo = sexo;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public static double calcular_promedio_grupal(Alumno []val){
		double sum=0;
		for(int x = 0 ; x<val.length;x++)
			sum = sum + val[x].getPromedio();
		return sum/val.length;
	}
	public static int total_de_reprobados(Alumno []val){
		int cont=0;
		for(int x = 0 ; x<val.length;x++)
			if (val[x].getPromedio()<70)
				cont++;
		return cont;
	}
public static void main(String[] args) {
		
		Alumno[] alumno = new Alumno[3];
		String nombre;
		String apellido;
		char sexo;
		int promedio;
/*
		for(int i=0;i<3;i++)
		{
			System.out.print("Ingrese el Nombre: ");
			nombre=Leer.dato();
			System.out.print("Ingrese el Apellido: ");
			apellido=Leer.dato();
			System.out.print("Ingrese el Sexo: ");
			sexo=Leer.datocar();
			System.out.print("Ingrese el Promedio: ");
			promedio=Leer.datoInt();
			System.out.println();
			alumno[i] = new Alumno(nombre,promedio,sexo,apellido);
		}
	*/
		alumno[0] = new Alumno("luis",60,'m',"sauceda");
		alumno[1] = new Alumno("pedro",20,'m',"sauceda");
		alumno[2] = new Alumno("fer",90,'f',"ramirez");
		
		System.out.println(Alumno.calcular_promedio_grupal(alumno));
		System.out.print("reprobados "+ Alumno.total_de_reprobados(alumno));
		
	}
}
