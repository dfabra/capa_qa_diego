package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String opcion;
        int numero1;
        int numero2;

        System.out.println("Elige la operación que desea realizar");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        opcion = leer.next();

        System.out.println("Escribe el primer número.");
        numero1=leer.nextInt();

        System.out.println("Escribe el primer número.");
        numero2=leer.nextInt();

        System.out.println("La operación a realizar es "+ numero1 + opcion + numero2);
        System.out.println("Resultado Suma: " + (numero1 + numero2));
        System.out.println("Resultado Resta: " + (numero1 - numero2));
        System.out.println("Resultado Producto: " + (numero1*numero2));
        System.out.println("Resultado División: " + (numero1/numero2));




    }
}
