package interfaces;

public class Animal implements  SerVivo {


    private String tipo;
    private String nombre;

    public Animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    @Override
    public void respirar() {

    }

    @Override
    public void caminar() {

    }

    @Override
    public String queCome(String alimentos) {
        return null;
    }

    @Override
    public int edad() {
        return 0;
    }

    @Override
    public void dormir(double tiempo) {

    }
}
