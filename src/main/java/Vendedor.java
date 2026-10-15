import java.time.LocalDate;

public class Vendedor extends Persona {

    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private double salario;


    //una sola sucursal
    private Sucursal sucursalElegida;

    //constructor
    public Vendedor(int documento, String nombre, String correo, int telefono, String codigoEmpleado, LocalDate fechaContratacion,double salarioSucursal, sucursalElegida) {
        super(documento, nombre, correo, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion= fechaContratacion;
        this.salario= salario;
        this.sucursalElegida= sucursalElegida;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public Sucursal getSucursalElegida() {
        return sucursalElegida;
    }

    public void setSucursalElegida(Sucursal sucursalElegida) {
        this.sucursalElegida = sucursalElegida;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigoEmpleado='" + codigoEmpleado + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario +
                ", sucursalElegida=" + sucursalElegida +
                '}';
    }
}
