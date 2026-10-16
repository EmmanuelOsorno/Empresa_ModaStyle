import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{
    private String codigoAfiliacion;
    private CategoriaCliente categoriaCliente;

    //
    private List<Venta> ListaVenta;

    //
    public Cliente(int documento, String nombre, String correo, int telefono, String codigoAfiliacion, CategoriaCliente categoriaCliente) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.categoriaCliente=categoriaCliente;

        ListaVenta=new ArrayList<>();

    }

    //
    public String getCodigoAfiliacion() {
        return codigoAfiliacion;
    }

    public void setCodigoAfiliacion(String codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public CategoriaCliente getCategoriaCliente() {
        return categoriaCliente;
    }

    public void setCategoriaCliente(CategoriaCliente categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }

    public List<Venta> getListaVenta() {
        return ListaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        ListaVenta = listaVenta;
    }

    //metodo para verificar una compra del cliente
    public boolean verificarCompra(String codigo){
        boolean existe= false;
        for(Venta venta: ListaVenta){
            if(venta.getCodigo().equalsIgnoreCase(codigo)){
                existe= true;
            }
        }
        return existe;
    }

    //metodo para agregar una compra al cliente
    public boolean agregarCompra(Venta venta){
        boolean compraAgregada= false;
        boolean compraVerificada= verificarCompra(venta.getCodigo());
        if(!compraVerificada){
            ListaVenta.add(venta);
            compraAgregada=true;
        }
        return compraAgregada;
    }

    //metodo para obtener el porcentaje de descuento segun la categoria del cliente
    public double calcularPorcentajeDescuento(){
        double descuento=categoriaCliente.getDescuento();
        return descuento;
    }

    //toString

    @Override
    public String toString() {
        return "Cliente " + getNombre()+
                "\ndocumento: "+ getDocumento()+
                "\ncorreo: "+getCorreo()+
                "\ntelefono: "+getTelefono()+
                "\ncodigoAfiliacion='" + codigoAfiliacion + '\'' +
                "\ncategoriaCliente=" + categoriaCliente +
                "\nListaVenta=" + ListaVenta+"\n";
    }
}
