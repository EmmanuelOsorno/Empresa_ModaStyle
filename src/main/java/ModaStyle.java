import java.util.ArrayList;
import java.util.List;

public class ModaStyle {

    private String nombreComercial;
    private String direccion;
    private int NIT;

    //listas

    private List<Sucursal> ListaSucursales;
    private List<Prenda> ListaPrendas;
    private List<Cliente> ListaCliente;
    private List<Empleado> ListaEmpleado;



    //Constructor


    public ModaStyle(String nombreComercial, String direccion, int NIT) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.NIT = NIT;

        //listas

        ListaSucursales = new ArrayList<>();
        ListaPrendas = new ArrayList<>();
        ListaCliente= new ArrayList<>();
        ListaEmpleado= new ArrayList<>();


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

    public List<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.ListaCliente = listaCliente;
    }

    public List<Empleado> getListaEmpleado() {
        return ListaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.ListaEmpleado = listaEmpleado;
    }


    //metodo para verificar cliente

    public boolean verificarCliente (int documento){
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
    public boolean agregarCliente (Cliente cliente){
        boolean agregado=false;
        boolean existe=verificarCliente(cliente.getDocumento());
        if(existe==false){
            ListaCliente.add(cliente);
            agregado=true;
        }
        return agregado;
    }

    //metodo para verificar empleado
    public boolean verificarEmpleado (int documento){
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
    public boolean agregarEmpleado(Empleado empleado){
        boolean agregado=false;
        boolean existe=verificarEmpleado(empleado.getDocumento());
        if(existe==false){
            ListaEmpleado.add(empleado);
            agregado=true;
        }
        return agregado;
    }


    //Agregar una prenda

    public boolean agregarPrenda(Prenda nuevaPrenda) {
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
    public boolean agregarSucursal(Sucursal sucursal) {
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
    //Buscar como hacerlo






}