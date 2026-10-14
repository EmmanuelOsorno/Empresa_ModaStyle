import java.util.ArrayList;

public class Sucursal {

    private  String codigo;
    private String nombre;
    private String direccion;
    private String ciudad;

    private List<Inventario> listaInventario;
    private List<vendedor>listaVendedores;
    private List<Venta> listaVentas;


    //Constructor

    public Sucursal(String codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;

        //listas
        listainventario = new ArrayList<>();
        listavendedores = new ArrayList<>();
        listaventas = new ArrayList<>();


        //Get y setter


        //Registrar en inventario las prendas/agregar inventario

        //consultar las prendas disponibles

        //consultar prendas agotadas en la sucursal

        //calcular los ingresos totales generados por la sucursal


        //registrar vendedor?
        //registrar venta confirmada?


    }


}
