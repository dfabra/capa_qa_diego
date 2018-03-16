package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioFor {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese números únicamente");
        System.out.println("Para cortar ingrese cualquier otro número");

        while(scanner.hasNextInt()){
            lista.add(scanner.nextInt());

        }
        for(int i=0; i<lista.size();i++){
            System.out.println("El número usando for es: "+ lista.get(i));

        }

        Iterator iterador = lista.iterator();
       while(iterador.hasNext()){
           int numero = Integer.parseInt(iterador.next().toString());
           System.out.println("El número usando iterator es: "+numero);
       }
       for(int numero: lista){
           System.out.println("El numero usando foreach es "+numero);

       }
        //si encuentro un numero en la lista menor a 15 muestro el mensaje
        for(int i=0; i<lista.size();i++){
           if(lista.get(i)<15){
               System.out.println("Se encontró un número menor a 15");
               break;
           }
            System.out.println("El numero usando for (menor a 15) es: "+lista.get(i));


        }
        //si encuentro un numero en la lista mayor a 15 corto el item
        for(int i=0;i<lista.size();i++){
            if(lista.get(i)>15){
                System.out.println("Se encontró un número mayor a 15");
                continue;
            }
            System.out.println("El numero usando for (mayor a 15) es: "+lista.get(i));


        }
    }


    }
