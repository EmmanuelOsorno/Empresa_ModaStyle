import java.util.ArrayList;
import java.util.List;

public class Inventario {


    private String color;
    private String talla; //no sé si puede aún.
    private int cantidadDisponible;


    //relaciones
    private Prenda prenda;
    private Sucursal sucursal;

    //Lista
    List<Venta> ListaVenta;

    public Inventario(String color, String talla, int cantidadDisponible, Prenda prenda, Sucursal sucursal) {
        this.color= color;
        this.talla= talla;
        this.cantidadDisponible= cantidadDisponible;
        this.prenda = prenda;
        this.sucursal = sucursal;

        ListaVenta = new ArrayList();
    }

    //get y setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<Venta> getListaVenta() {
        return ListaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        ListaVenta = listaVenta;
    }



    //verificar la cantidad de producto

    public boolean verificarDisponibilidad(int cantidadSolicitada) {
        return this.cantidadDisponible >= cantidadSolicitada;
    }

    //Agregar cantidad
    public void agregarCantidad(int cantidad) {

        if (cantidad > 0) {
            cantidadDisponible += cantidad;
        }
    }



    //actualizar la cantidad después de una venta/reducirExistencias

    public boolean reducirUnidades(int cantidadRestada) {
        if (verificarDisponibilidad(cantidadRestada)) {
            this.cantidadDisponible -= cantidadRestada;
            return true;
        }
        return false;
    }

    //calcular unidades vendidas
    public int calcularUnidadesVendidas() {

        int total = 0;

        for (Venta venta : ListaVenta) {
            total += venta.obtenerCantidadPrenda(this);
        }

        return total;
    }
}