package ar.edu.unlam.interfaz;

import java.util.Scanner;//importar el teclado

public class ActClase {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner (System.in);//salida por teclado declaración
		// TODO Auto-generated method stub
		//pido la nota 1
		//pido la nota 2
		//pido la nota 3
		//luego sumo las 3 notas y el resultado lo divido por la cantidad de examenes
		//devuelvo el promedio
		
		System.out.println("ingreso nota 1");
		double nota1=teclado.nextDouble();//salida por teclado
		
		System.out.println("ingreso nota 2");
		double nota2=teclado.nextDouble();
		
		System.out.println("ingreso nota 3");
		double nota3=teclado.nextDouble();
		
		double promedio= (nota1+nota2+nota3)/3;
		
		System.out.println("El promedio es: "+promedio);
	}

}
