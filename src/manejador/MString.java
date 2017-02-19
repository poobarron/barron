package manejador;

public class MString {
	public int numero_de_incidencias(String cadena, char caracter){
		int repeticiones=0;
		for(int  i=0;i<cadena.length();i++){
			if (cadena.charAt(i)==caracter)
				repeticiones++;
		}
		return repeticiones; 
	}
}
