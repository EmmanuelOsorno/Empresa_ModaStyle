import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Empleado extends Persona{
    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private double salario;

    //
    private static List<Venta> ListaVenta;

    //
    public Empleado(int documento, String nombre, String correo, int telefono, String codigoEmpleado, LocalDate fechaContratacion, double salario) {
        super(documento, nombre, correo, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;

        ListaVenta=new ArrayList<>();
    }

    //
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

    public static List<Venta> getListaVenta() {
        return ListaVenta;
    }

    public static void setListaVenta(List<Venta> listaVenta) {
        ListaVenta = listaVenta;
    }

    //metodo para verificar una venta del empleado
    public static boolean verificaVenta(String codigo){
        boolean existe= false;
        for(Venta venta: ListaVenta){
            if(venta.getCodigo().equalsIgnoreCase(codigo)){
                existe= true;
            }
        }
        return existe;
    }

    //metodo para agregar una venta al empleado
    public static boolean agregarVenta(Venta venta){
        boolean ventaAgregada= false;
        boolean ventaVerificada= verificaVenta(venta.getCodigo());
        if(!ventaVerificada){
            ListaVenta.add(venta);
            ventaAgregada=true;
        }
        return ventaAgregada;
    }

}
