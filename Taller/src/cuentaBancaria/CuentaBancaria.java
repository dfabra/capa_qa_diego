package cuentaBancaria;

public class CuentaBancaria {

    private final double COMISION = 1.2;
    private final double COMISION_GIRO = 5;
    private String titular;
    private String dni;
    private double saldo ;
    private double monto;

    public CuentaBancaria() {
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0;
        this.monto = 0;
        
    }

    public CuentaBancaria(String titular, String dni, double monto, double saldo) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = saldo;
        this.monto = monto;
    }

    public double calcularComisionDeRetiro(){
        int retiro = 0;
        double comision = 0;
        retiro = (int) (this.monto/1000);
         if (retiro > 0){
             comision = retiro * COMISION;
         } return comision;
    }

    public boolean tieneSaldo(){
            if (this.getSaldo()>=0){
            return true;
        }
        return false;
    }

    public double calcularRetiro(){
        

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String mostrarDatosCuenta(){
        return ("Titular "+this.getTitular()+ " DNI: "+ this.getDni()+ " Monto a retirar: "+ this.getMonto()+ " Saldo Disponible: "+this.getSaldo());
    }



}
