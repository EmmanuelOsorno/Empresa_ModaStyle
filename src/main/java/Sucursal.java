import java.util.ArrayList;
import java.util.List;

public class Sucursal {

    private String codigo;
    private String nombre;
    private String direccion;
    private String ciudad;


    //listas
    private List<Inventario> ListaInventario;
    private List<Empleado> ListaEmpleados;
    private List<Venta> ListaVentas;

    //Constructor

    public Sucursal(String codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;

        //listas

        ListaInventario = new ArrayList<>();
        ListaEmpleados = new ArrayList<>();
        ListaVentas = new ArrayList<>();
    }


    //Get y setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Inventario> getListaInventario() {
        return ListaInventario;
    }

    public void setListaInventario(List<Inventario> listaInventario) {
        this.ListaInventario = listaInventario;
    }

    public List<Empleado> getListaEmpleados() {
        return ListaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        ListaEmpleados = listaEmpleados;
    }

    public List<Venta> getListaVentas() {
        return ListaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.ListaVentas = listaVentas;
    }


    //Registrar en inventario las prendas/agregar inventario

    public boolean agregarInventario(Inventario registroN) {
        for (Inventario inventa : ListaInventario) {
            boolean mismaPrenda = inventa.getPrenda().getCodigo().equalsIgnoreCase(registroN.getPrenda().getCodigo());
            boolean mismaTalla = inventa.getTalla().equalsIgnoreCase(registroN.getTalla());
            boolean mismoColor = inventa.getColor().equalsIgnoreCase(registroN.getColor());

            if (mismaPrenda && mismaTalla && mismoColor) {
                System.out.println("Ya existe un registro de inventario para la prenda "
                        + registroN.getPrenda().getCodigo()
                        + " en talla " + registroN.getTalla()
                        + " y color " + registroN.getColor() + ".");
                return false;
            }
        }
        this.ListaInventario.add(registroN);
        return true;
    }

    //obtener cantidad prenda


    //consultar las prendas disponibles

    public List<Inventario> consultarPrendasDisponibles() {
        List<Inventario> prendasDisponibles = new ArrayList<>();
        for (Inventario inventa : ListaInventario) {
            if (inventa.getCantidadDisponible() > 0) {
                prendasDisponibles.add(inventa);
            }
        }
        return prendasDisponibles;
    }

    //consultar prendas agotadas en la sucursal

    public List<Inventario> consultarPrendasAgotadas() {
        List<Inventario> agotado = new ArrayList<>();
        for (Inventario inventa : ListaInventario) {
            if (inventa.getCantidadDisponible() == 0) {
                agotado.add(inventa);
            }
        }
        return agotado;
    }


    //calcular los ingresos totales generados por la sucursal

    public double calcularIngresosTotales() {
        double totalIngresos = 0;
        for (Venta venta : ListaVentas) {
            totalIngresos += venta.getValorTotalVenta();
        }
        return totalIngresos;
    }

}




