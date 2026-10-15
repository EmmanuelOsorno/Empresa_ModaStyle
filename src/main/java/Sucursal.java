import java.util.ArrayList;
import java.util.List;

public class Sucursal {

    private  String codigo;
    private String nombre;
    private String direccion;
    private String ciudad;

    private List<Inventario> listaInventario;
    private List<Vendedor>listaVendedores;
    private List<Venta> listaVentas;


    //Constructor

    public Sucursal(String codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;

        //listas

        listaInventario = new ArrayList<>();
        listaVendedores = new ArrayList<>();
        listaVentas = new ArrayList<>();
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
        return listaInventario;
    }

    public void setListaInventario(List<Inventario> listaInventario) {
        this.listaInventario = listaInventario;
    }

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }


    //Registrar en inventario las prendas/agregar inventario

        //consultar las prendas disponibles

        //consultar prendas agotadas en la sucursal

        //calcular los ingresos totales generados por la sucursal


        //registrar vendedor?
        //registrar venta confirmada?





}
