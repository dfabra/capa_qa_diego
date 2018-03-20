package com.company;

public class principal {
    public static void main(String[] args) {
        Persona pers = new Persona("Juan", "Perez", 17, "1234567", 60, "Masculino", 165);
        System.out.println(pers.getNombre()+" "+pers.getApellido());
        System.out.println("Es mayor de edad: "+pers.esMayorDeEdad());
    }


}