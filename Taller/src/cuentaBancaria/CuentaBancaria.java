package cuentaBancaria;

public class CuentaBancaria {

  final double FACTOR_COMISION = 1000;
  public static final double COMISION = 1.2;
  public static final double COMISION_SOBREGIRO = 5;
  private String titular;
  private String dni;
  private double saldo;
  private double monto;

  public CuentaBancaria() {
  }

  public CuentaBancaria(String titular, String dni) {
    this(titular, dni, 0, 0);
  }

  public CuentaBancaria(String titular, String dni, double saldo, double monto) {
    this.titular = titular;
    this.dni = dni;
    if (saldo <= 0) {
      this.saldo = 0;
    } else {
      this.saldo = saldo;
    }
    if (monto > 0) {
      this.monto = monto;
    } else {
      this.monto = 0;
    }
  }

  private double calcularComisionDeRetiro() {
    if (this.monto >= FACTOR_COMISION) {
      int conversion = (int) (this.monto / FACTOR_COMISION);
      double comision = conversion * COMISION;
      return (conversion * FACTOR_COMISION) * (comision / 100);
    }
    return 0;
  }

  public void ingresarDinero(double cantidad) {
    if (cantidad > 0) {
      this.saldo += cantidad;
      System.out
          .println("Se acredito: " + cantidad + " a la cuenta, su nuevo saldo es: " + this.saldo);
    }
  }

  public void retirar(double monto) {
    this.monto = monto;
    if (verificarSaldo(calcularComisionDeRetiro())) {
      this.saldo -= calcularComisionDeRetiro() + monto;
    }

  }

  private boolean verificarSaldo(double comision) {
    if (this.saldo - (this.monto + comision) < 0) {
      System.out.println(
          "Saldo insuficiente para la operación, se le efectuara un cargo de " + COMISION_SOBREGIRO
              + " de comisión");
      this.saldo -= COMISION_SOBREGIRO;
      return false;
    }
    System.out.println("Se descontara una comision del saldo de: " + comision);
    return true;

  }


  public String getTitular() {
    return titular;
  }

  public String getDni() {
    return dni;
  }

  public double getSaldo() {
    return saldo;
  }

  public double getMonto() {
    return monto;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  public String mostrarDatosCuenta(){
    return ("Titular "+this.getTitular()+ " DNI: "+ this.getDni()+ " Monto a retirar: "+ this.getMonto()+ " Saldo Disponible: "+this.getSaldo());
  }

}
