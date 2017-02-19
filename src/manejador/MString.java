package manejador;

public class MString {
	public int numero_de_incidencias(String cadena, char caracter){
		int repeticiones=0;
		for(int  i=0;i<cadena.length();i++)
			if (cadena.charAt(i)==caracter)
				repeticiones++;
		return repeticiones; 
	}
	public int cantidad_de_digitos(String cadena){
		int repeticiones=0;
		for(int  i=0;i<cadena.length();i++)
			if (cadena.charAt(i)<='9'&&cadena.charAt(i)>='0')
				repeticiones++;
		return repeticiones; 
	}
	public boolean es_par(int numero){
		return numero%2==0;
	}
}
