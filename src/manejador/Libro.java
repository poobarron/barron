package manejador;

public class Libro {
	String titulo;
	String autor;
	String editorial;
	int ano;
	int clasificacion;
	public Libro(String titulo, String autor, String editorial, int ano, int clasificacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.ano = ano;
		this.clasificacion = clasificacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(int clasificacion) {
		this.clasificacion = clasificacion;
	} 
	public static int[] obtener_cantiadad_por_clasificacion (Libro[] val){
		int []respuesta= new int[] {0,0,0,0,0,0,0,0,0,0,0};
		for (int x = 0 ;x<val.length;x++)
			respuesta[val[x].getClasificacion()]++;
		return respuesta;
	} 
	public static void main(String []args) {
		Libro [] l = new Libro[] {new Libro("","","",0,0),
								new Libro("","","",0,1),
								new Libro("","","",0,0),
								new Libro("","","",0,1),
								new Libro("","","",0,3),
								new Libro("","","",0,2)};
		int []vals = Libro.obtener_cantiadad_por_clasificacion(l);
		for(int x= 0 ; x<vals.length;x++){
			System.out.println("casificacion "+x+" y numero de incidencias"+ vals[x]);
		}
	}
}
