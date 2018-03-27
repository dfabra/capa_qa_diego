package cuentaBancaria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String titular;
    String dni;
    double monto;
    double saldo;

    Scanner consola = new Scanner(System.in);

    ArrayList<CuentaBancaria> listaClientes = new ArrayList<CuentaBancaria>();

    System.out.println("Ingrese número de clientes: ");
    int numeroClientes = consola.nextInt();

    for (int i = 0; i < numeroClientes; i++) {
      CuentaBancaria cuenta = new CuentaBancaria();

      System.out.println("Datos cuenta " + (i + 1));

      System.out.println("\nIngrese el titular de la cuenta: ");

      titular = consola.next();
      cuenta.setTitular(titular);

      System.out.println("\nIngrese el dni del titular");
      dni = consola.next();
      cuenta.setDni(dni);

      System.out.println("\nIngrese un monto a retirar");
      monto = consola.nextDouble();
      cuenta.setMonto(monto);

      System.out.println("\nIngrese un saldo");

      saldo = consola.nextDouble();
      cuenta.setSaldo(saldo);

      listaClientes.add(cuenta);
    }

    Iterator<CuentaBancaria> it = listaClientes.iterator();

    while (it.hasNext()) {
      CuentaBancaria c = it.next();
      System.out.println(c.mostrarDatosCuenta());
    }


  }


}
