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
	public boolean es_decimal(double d){
		int numero2 = (int) d;
		return !(numero2==d);
	}
	public boolean es_primo(int numero){
		if (numero<2)
			return false;
		if (es_decimal(numero))
			return false;
		for (int i=2;i<numero;i++){
			if (!(es_decimal((double)numero/i)))
				return false;
			
		}
		return true;
	}
}
