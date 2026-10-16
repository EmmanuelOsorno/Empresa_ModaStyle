import java.util.ArrayList;
import java.util.List;

public class ModaStyle {

    private static String nombreComercial;
    private static String direccion;
    private static int NIT;

    //listas

    private static List<Sucursal> ListaSucursales;
    private static List<Prenda> ListaPrendas;
    private static List<Cliente> ListaCliente;
    private static List<Empleado> ListaEmpleado;
    private static List<Venta> ListaVenta;



    //Constructor

    public ModaStyle(String nombreComercial, String direccion, int NIT) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.NIT = NIT;

        //listas

        ListaSucursales = new ArrayList<>();
        ListaPrendas = new ArrayList<>();
        ListaCliente = new ArrayList<>();
        ListaEmpleado = new ArrayList<>();
        ListaVenta= new ArrayList<>();



    }

    //GET Y SET

    public static String getNombreComercial() {
        return nombreComercial;
    }

    public static void setNombreComercial(String nombreComercial) {
        ModaStyle.nombreComercial = nombreComercial;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        ModaStyle.direccion = direccion;
    }

    public static int getNIT() {
        return NIT;
    }

    public static void setNIT(int NIT) {
        ModaStyle.NIT = NIT;
    }

    public static List<Sucursal> getListaSucursales() {
        return ListaSucursales;
    }

    public static void setListaSucursales(List<Sucursal> listaSucursales) {
        ListaSucursales = listaSucursales;
    }

    public static List<Prenda> getListaPrendas() {
        return ListaPrendas;
    }

    public static void setListaPrendas(List<Prenda> listaPrendas) {
        ListaPrendas = listaPrendas;
    }

    public static List<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public static void setListaCliente(List<Cliente> listaCliente) {
        ListaCliente = listaCliente;
    }

    public static List<Empleado> getListaEmpleado() {
        return ListaEmpleado;
    }

    public static void setListaEmpleado(List<Empleado> listaEmpleado) {
        ListaEmpleado = listaEmpleado;
    }

    public static List<Venta> getListaVenta() {
        return ListaVenta;
    }

    public static void setListaVenta(List<Venta> listaVenta) {
        ListaVenta = listaVenta;
    }
    //metodo para verificar cliente

    public static boolean verificarCliente(int documento) {
        boolean existe = false;
        for (Cliente cliente : ListaCliente) {
            if (cliente.getDocumento() == documento) {
                existe = true;
                break;
            }
        }
        return existe;
    }


    //metodo para agregar cliente
    public static boolean agregarCliente(Cliente cliente) {
        boolean agregado = false;
        boolean existe = verificarCliente(cliente.getDocumento());
        if (existe == false) {
            ListaCliente.add(cliente);
            agregado = true;
        }
        return agregado;
    }

    //metodo para verificar empleado
    public static boolean verificarEmpleado(int documento) {
        boolean existe = false;
        for (Empleado empleado : ListaEmpleado) {
            if (empleado.getDocumento() == documento) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    //metodo para agregar empleado
    public static boolean agregarEmpleado(Empleado empleado) {
        boolean agregado = false;
        boolean existe = verificarEmpleado(empleado.getDocumento());
        if (existe == false) {
            ListaEmpleado.add(empleado);
            agregado = true;
        }
        return agregado;
    }

    public static boolean agregarPrenda(Prenda nuevaPrenda) {
        for (Prenda p : ListaPrendas) {
            if (p.getCodigo().equalsIgnoreCase(nuevaPrenda.getCodigo())) {
                System.out.println("Ya existe una prenda con el código " + nuevaPrenda.getCodigo());
                return false;
            }
        }
        ListaPrendas.add(nuevaPrenda);
        return true;
    }

    //agregar una  sucursal
    public static boolean agregarSucursal(Sucursal sucursal) {
        for (Sucursal su : ListaSucursales) {
            if (su.getCodigo().equalsIgnoreCase(sucursal.getCodigo())) {
                System.out.println(" Ya existe una sucursal con el código " + sucursal.getCodigo());
                return false;
            }
        }
        ListaSucursales.add(sucursal);
        return true;
    }


    //identificar la referencia de prenda con mayor ventas

    public static Prenda buscarPrendaMasVendida() {

        Prenda prendaMasVendida = null;
        int mayorCantidad = 0;

        for (Sucursal sucursal : ListaSucursales) {

            for (Inventario inventario : sucursal.getListaInventario()) {

                int unidadesVendidas = inventario.calcularUnidadesVendidas();

                if (unidadesVendidas > mayorCantidad) {

                    mayorCantidad = unidadesVendidas;
                    prendaMasVendida = inventario.getPrenda();
                }
            }
        }

        return prendaMasVendida;
    }

    //toString
    @Override
    public String toString() {
        return "ModaStyle {" +
                "nombreComercial='" + nombreComercial +
                ", direccion='" + direccion +
                ", NIT=" + NIT + "\n"+
                ", Sucursales registradas=" + ListaSucursales +
                ", Prendas registradas=" + ListaPrendas +
                ", Clientes registrados=" + ListaCliente +
                ", Empleados registrados=" + ListaEmpleado +
                ", Ventas registradas=" + ListaVenta +
                '}';
    }

}