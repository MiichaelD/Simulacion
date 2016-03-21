package numAlea;
import java.io.File;
import java.util.*;
import javax.swing.*;
public class JiCuadrada {

	public static void main(String[] args) throws Exception {
		double k=Integer.parseInt(JOptionPane.showInputDialog("Numero de Clases? \'k\' o \'n\'"));
		int N=Integer.parseInt(JOptionPane.showInputDialog("Numero de Observaciones \'N\'"));
		Scanner entrada=new Scanner(new File("src/numAlea/digitos.txt"));
		String temp;
		int[] vec=new int[(int)k];
		double[]lim=new double[(int)k];

		for(int i=1;i<=k;i++)
			lim[i-1]=JiCuadrada.truncar((i/k),3);

		while(entrada.hasNext()){
			temp=entrada.next();
			for(int i=0;i<=k;i++){
				if(Double.parseDouble(temp)<=lim[i]){
					vec[i]++;
					break;}
			}
		}

		System.out.println("Indice \t Limites \t Oi \t Ei \t\t (Oi-Ei)^2/Ei");
		for(int i=0;i<k;i++){
			System.out.println((i+1)+" \t "+lim[i]+" \t\t "+vec[i]+" \t "+
				JiCuadrada.truncar(N/k,3)+" \t\t "+JiCuadrada.truncar(Math.pow((vec[i]-(N/k)),2)/(N/k),3)  );
		}
	}

	public static double truncar(double doble,int digitos){
		return ((int)(doble*Math.pow(10,digitos)))/Math.pow(10,digitos);
	}
}
