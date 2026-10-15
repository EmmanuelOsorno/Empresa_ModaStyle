import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private int cantidadDisponible;


    //relaciones
    private Prenda prenda;
    private Sucursal sucursal;

    List<Venta> ListaVenta;

    public Inventario(int cantidadDisponible, Prenda prenda, Sucursal sucursal) {
        this.cantidadDisponible= cantidadDisponible;
        this.prenda = prenda;
        this.sucursal = sucursal;

        ListaVenta = new ArrayList();
    }

    //get y setter


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


    //actualizar la cantidad después de una venta/reducirExistencias

    public boolean reducirUnidades(int cantidadRestada) {
        if (verificarDisponibilidad(cantidadRestada)) {
            this.cantidadDisponible -= cantidadRestada;
            return true;
        }
        return false;
    }
}
