package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class ActJeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		//mostrar: IVA(0.21), el precio bruto de los 3 jean(12k cada uno), el monto correspondiente del IVA, y el precio final
		
		int jean=12000;
		float iva=0.21f;
		
		int precioFinal=jean*3;
		
		System.out.println("El iva es del "+iva+". El precio bruto total de los Jeans es de "+precioFinal+".El iva del total seria "+precioFinal*iva+""
				+ ".Junto con el iva, quedaria todo en "+((precioFinal*iva)+precioFinal));
		
	}

}
