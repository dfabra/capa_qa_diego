package capacitacionQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EjerciosJava {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List<Double> numeros = new ArrayList<Double>();
		double resultado = 0;
		String operador;
		boolean continuar = false;
		String respuesta;
		
		List<String> operaciones = Arrays.asList("Suma","Resta","Multiplicacion","Division");
		System.out.println("Por favor ingresa una de las siguientes opciones para realizar la operación: ");
		for (String op : operaciones) {
			System.out.println(op);
		}
		operador = input.nextLine();
		
		if (!operador.isEmpty()) {
			
		
		switch (operador.toUpperCase()) {
		case "SUMA":
			//Puede recibir dos o mas números para realizar la operación
			break;
		case "RESTA":
			//Puede recibir dos o mas números para realizar la operación
			break;
		case "MULTIPLICACION":
			// Puede recibir dos o mas números para realizar la operación
			break;
		case "DIVISION":
			//Debe recibir solo dos numeros para realizar la operación, validar que no permita realizar una duvisión entre cero.
			//En caso de que la division sea entre cero mostrar mensaje indicando que no se puede hacer.
			break;
			
			//Validar que si no se ingresa ninguna de las operaciones permitidas muestre un mensaje indicandolo.
		}
		
		}
		
		System.out.println("El resultado de la " + operador + " es: " + resultado);
		input.close();
		


	}

}
