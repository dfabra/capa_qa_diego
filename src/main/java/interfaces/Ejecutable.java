package interfaces;


public class Ejecutable {

    public static void main(String [] args){

        Persona persona = new Persona("Angel Fernandez",  51);
        persona.respirar();
        persona.caminar();
        System.out.println(persona.queCome("Bizochos"));
        System.out.println(persona.equipo());
        System.out.println("Campeonatos: "+persona.campeonatos());
    }

}
