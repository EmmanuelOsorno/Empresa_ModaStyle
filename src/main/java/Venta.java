import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String codigo;
    private LocalDate fechaVenta;
    private Cliente cliente;

    //Vendedor?
    //crear una lista de venta...

    private List<Prenda> ListaPrenda;
    //
    public Venta(String codigo, LocalDate fechaVenta, Cliente cliente) {
        this.codigo = codigo;
        this.fechaVenta = fechaVenta;
        this.cliente=cliente;

        ListaPrenda=new ArrayList<>();
    }

    //
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Prenda> getListaPrenda() {
        return ListaPrenda;
    }

    public void setListaPrenda(List<Prenda> listaPrenda) {
        ListaPrenda = listaPrenda;
    }

    // metodo para calcular el valor unitario total de la venta con el descuento del cliente
    public double calcularValorUnitarioTotalVenta(){
        double valorUnitarioTotalVenta=0;
        for(Prenda prenda:ListaPrenda){
            valorUnitarioTotalVenta+=prenda.calcularPrecioPrenda()-cliente.calcularPorcentajeDescuento();
        }
        return valorUnitarioTotalVenta;
    }

}

