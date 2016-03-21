package numAlea;
import java.util.*;
import java.io.*;
public class InversorDigitos {

	public static void main(String[] arg) throws IOException{
		String cadena=null;
		DataOutputStream salida=new DataOutputStream(new FileOutputStream("src/numAlea/digitos.txt"));
		Scanner entrada=new Scanner(new File("src/numAlea/digitos(23feb12).txt"));
		while(entrada.hasNext()){
			cadena=entrada.next();
			cadena=cadena.substring(0,2)+cadena.charAt(3)+cadena.charAt(2);
			salida.writeBytes(cadena+"\n");

		}System.out.println("Archivo generado Digitos.txt");
	}
}

