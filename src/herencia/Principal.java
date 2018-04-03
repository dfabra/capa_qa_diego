package herencia;

public class Principal {
    public static void main (String [] args){

        Empleado empleado = new Empleado("Jose", "Perez", "M", 35,
                "1234567", "12345", "2010", 1000, "Director", "IT");
        System.out.println("Nombre del empleado: "+empleado.getNombre()+ " apellido del empleado: "+empleado.getApellido());
        System.out.println("La antiguedad del empleado es de: "+empleado.antiguedad()+ " años ");
        System.out.println("El salario actual del empleado es: "+empleado.aumento());
        System.out.println(empleado.queHace());
    }
}
