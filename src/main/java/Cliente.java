import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{
    private String codigoAfiliacion;

    //
    private List<Venta> ListaVenta;

    //
    public Cliente(int documento, String nombre, String correo, int telefono, String codigoAfiliacion) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;

        ListaVenta=new ArrayList<>();

    }

    //
    public String getCodigoAfiliacion() {
        return codigoAfiliacion;
    }

    public void setCodigoAfiliacion(String codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public List<Venta> getListaVenta() {
        return ListaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        ListaVenta = listaVenta;
    }

    //

}
