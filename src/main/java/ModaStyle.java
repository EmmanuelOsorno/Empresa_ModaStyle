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
    private static List<Prenda> ListaPrenda;
    private static List<Sucursal> ListaSucursal;


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
        ListaVenta = new ArrayList<>();
        ListaPrendas=new ArrayList<>();
        ListaSucursal=new ArrayList<>();


    }

    //GET Y SET

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public List<Sucursal> getListaSucursales() {
        return ListaSucursales;
    }

    public void setListaSucursales(List<Sucursal> listaSucursales) {
        this.ListaSucursales = listaSucursales;
    }

    public List<Prenda> getListaPrendas() {
        return ListaPrendas;
    }

    public void setListaPrendas(List<Prenda> listaPrendas) {
        this.ListaPrendas = listaPrendas;
    }

    public static List<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.ListaCliente = listaCliente;
    }

    public static List<Empleado> getListaEmpleado() {
        return ListaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.ListaEmpleado = listaEmpleado;
    }

    public static List<Venta> getListaVenta() {
        return ListaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        ListaVenta = listaVenta;
    }

    public static List<Prenda> getListaPrenda() {
        return ListaPrenda;
    }

    public static void setListaPrenda(List<Prenda> listaPrenda) {
        ListaPrenda = listaPrenda;
    }

    public static List<Sucursal> getListaSucursal() {
        return ListaSucursal;
    }

    public static void setListaSucursal(List<Sucursal> listaSucursal) {
        ListaSucursal = listaSucursal;
    }

    //metodo para verificar cliente
    public static boolean verificarCliente (int documento){
        boolean existe=false;
        for(Cliente cliente: ListaCliente){
            if(cliente.getDocumento()==documento){
                existe=true;
                break;
            }
        }
        return existe;
    }

    //metodo para agregar cliente
    public static boolean agregarCliente (Cliente cliente){
        boolean agregado=false;
        boolean existe=verificarCliente(cliente.getDocumento());
        if(existe==false){
            ListaCliente.add(cliente);
            agregado=true;
        }
        return agregado;
    }

    //metodo para verificar empleado
    public static boolean verificarEmpleado (int documento){
        boolean existe=false;
        for(Empleado empleado: ListaEmpleado){
            if(empleado.getDocumento()==documento){
                existe=true;
                break;
            }
        }
        return existe;
    }

    //metodo para agregar empleado
    public static boolean agregarEmpleado(Empleado empleado){
        boolean agregado=false;
        boolean existe=verificarEmpleado(empleado.getDocumento());
        if(existe==false){
            ListaEmpleado.add(empleado);
            agregado=true;
        }
        return agregado;
    }


    //Agregar una prenda

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

    //agregar una nueva sucursal
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

    //metodo para verificar venta
    public static boolean verificarVenta(String codigo) {
        boolean existe = false;
        for(Venta venta : ListaVenta) {
            if(venta.getCodigo().equalsIgnoreCase(codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    //metodo para agregar venta
    public static boolean agregarVenta(Venta venta) {
        boolean agregado = false;
        boolean existe = verificarVenta(venta.getCodigo());
        if(existe == false) {
            ListaVenta.add(venta);
            agregado = true;
        }
        return agregado;
    }

    //toString
    @Override
    public String toString() {
        return "ModaStyle {" +
                "nombreComercial='" + nombreComercial + '\'' +
                ", direccion='" + direccion + '\'' +
                ", NIT=" + NIT +
                ", Sucursales registradas=" + ListaSucursales +
                ", Prendas registradas=" + ListaPrendas +
                ", Clientes registrados=" + ListaCliente +
                ", Empleados registrados=" + ListaEmpleado +
                ", Ventas registradas=" + ListaVenta +
                ", Prendas registrados=" + ListaEmpleado +
                ", Sucursales registradas=" + ListaVenta +
                '}';
    }


}