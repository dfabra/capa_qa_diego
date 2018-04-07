package interfaces;

public class Persona implements SerVivo, Jugador{

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void respirar() {
        System.out.println("La persona respira");

    }

    @Override
    public void caminar() {
        System.out.println("La persona "+nombre+ " camina");


    }

    @Override
    public String queCome(String alimentos) {
        return "La persona "+nombre+ " come "+alimentos;
    }

    @Override
    public int edad() {
        return 0;
    }

    @Override
    public void dormir(double tiempo) {

    }

    @Override
    public String equipo() {
        return "La persona "+nombre+ " pertenece al equipo Juventus";
    }

    @Override
    public void cantidadDeJuegos() {

    }

    @Override
    public int campeonatos() {
        return 0;
    }
}
