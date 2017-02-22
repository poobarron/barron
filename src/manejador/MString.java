package manejador;

import java.util.ArrayList;

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
	public boolean es_primo(double numero){
		if (numero<2)
			return false;
		if (es_decimal(numero))
			return false;
		for (int i=2;i<numero;i++)
			if (!(es_decimal((double)numero/i)))
				return false;
		return true;
	}
	public String numero_a_letras(int numero){
		if (numero<-1&& numero>11)
		 return "numero invalido";
		switch (numero){
		case 0: return "cero";
		case 1: return "uno";
		case 2: return "dos";
		case 3: return "tres";
		case 4: return "cuatro";
		case 5: return "cinco";
		case 6: return "seis";
		case 7: return "siete";
		case 8: return "ocho";
		case 9: return "nueve";
		default: return "diez";
		}
	}
	
	public int calcular_decenas(int val){
		if (val<0||val>99){
			System.out.println("Valores fuera de rango");
			return -1;
		}
		return (int) val/10; 
	}
	public boolean es_palindromo(String val){
		String cad2="";
		val = val.replaceAll(" ", "");
		for (int x=0 ;x<val.length();x++ )
			cad2 = cad2 + val.charAt(val.length()-x-1);
		return val.compareToIgnoreCase(cad2)==0;
	}
	public ArrayList<Integer> obtener_divisores(int val){
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		for (int i=1;i<=val;i++)
			if (!(es_decimal((double)val/i))){
				arreglo.add(i);
				System.out.println(i);
			}
		return arreglo;
	}
}
