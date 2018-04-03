package herencia;

public class Empleado  extends Persona{

    private final int DATE = 2018;
    private String numeroEmpleado;
    private String  fechaIngreso;
    private double salarioIngreso;
    private String puestoActual;
    private String departamento;

    public Empleado(String nombre, String apellido, String sexo, int edad, String dni, String numeroEmpleado,
                    String fechaIngreso, double salarioIngreso, String puestoActual, String departamento) {
        super(nombre, apellido, sexo, edad, dni);
        this.numeroEmpleado = numeroEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.salarioIngreso = salarioIngreso;
        this.puestoActual = puestoActual;
        this.departamento = departamento;
    }


    @Override
    public String queHace() {
        return "Lo que hace esta persona es: " +puestoActual;
    }

    public int antiguedad(){
        return DATE - (Integer.parseInt(fechaIngreso));
    }

    public double aumento(){
        if (antiguedad()>2){
            return (antiguedad() * 1.05) * salarioIngreso;
        }
        else {
            return (antiguedad()*1.02)* salarioIngreso;
        }
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }



    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }



    public String getFechaIngreso() {
        return fechaIngreso;
    }



    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }



    public double getSalarioIngreso() {
        return salarioIngreso;
    }



    public void setSalarioIngreso(double salarioIngreso) {
        this.salarioIngreso = salarioIngreso;
    }



    public String getPuestoActual() {
        return puestoActual;
    }



    public void setPuestoActual(String puestoActual) {
        this.puestoActual = puestoActual;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


}
