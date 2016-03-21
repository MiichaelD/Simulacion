package numAlea;
public class CentrosAlMedio {

	public static void main (String[] arg){

		int raiz=2882,resultado=0;
		String cuadrado;

		System.out.println("Metodo Centros al medio - Simulacion");

		for(int i=0;i<20;i++){
			cuadrado=""+(int)Math.pow(raiz, 2);
			while(cuadrado.length()<8){
				cuadrado=("0"+cuadrado);}
			resultado=Integer.parseInt((""+cuadrado).substring(2,6));
		System.out.println("X"+i+"= "+raiz+"\tX"+i+"2= "+(cuadrado)+"\tR"+(i+1)+"= ."+resultado);
		raiz=resultado;
		}
	}
}
