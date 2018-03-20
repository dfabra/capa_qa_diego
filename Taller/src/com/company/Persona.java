package com.company;

public class Persona {

    private final int YEAR = 2018;
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private float peso;
    private String sexo;
    private double altura;

    //constructor
    public Persona(String nombre, String apellido, int edad, String dni, float peso, String sexo, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.sexo = sexo;
        this.altura = altura;
    }

    //get & set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public float calcularImc(float peso, float altura){
        return peso/(altura*altura);
    }

    public boolean esMayorDeEdad(){
        if(this.edad>=18){
            return true;
        }
        return false;
    }
    public int yearBorn (int edad){
        return YEAR - edad;
    }



}
