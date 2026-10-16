import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String codigo;
    private LocalDate fechaVenta;
    private Cliente cliente;

    private double valorTotalVenta;


    private List<Prenda> ListaPrenda;
    private List<Inventario>ListaInventario;

    //
    public Venta(String codigo, LocalDate fechaVenta, Cliente cliente, double valorTotalVenta) {
        this.codigo = codigo;
        this.fechaVenta = fechaVenta;
        this.cliente=cliente;
        this.valorTotalVenta= valorTotalVenta;

        ListaPrenda=new ArrayList<>();
        ListaInventario= new ArrayList<>();
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

    public double getValorTotalVenta() {
        return valorTotalVenta;
    }
    public void setValorTotalVenta(double valorTotalVenta) {
        this.valorTotalVenta = valorTotalVenta;
    }

    public List<Prenda> getListaPrenda() {
        return ListaPrenda;
    }

    public void setListaPrenda(List<Prenda> listaPrenda) {
        ListaPrenda = listaPrenda;
    }

    public List<Inventario> getListaInventario() {
        return ListaInventario;
    }

    public void setListaInventario(List<Inventario> listaInventario) {
        ListaInventario = listaInventario;
    }
    //obtener cantidad prenda

    public int obtenerCantidadPrenda(Inventario inventario) {
        int total = 0;

        for (Inventario i : ListaInventario) {
            if (i == inventario) {
                total += i.getCantidadDisponible();
            }
        }

        return total;
    }



    // metodo para calcular el valor unitario total de la venta con el descuento del cliente
    public double calcularValorUnitarioTotalVenta(){
        double valorUnitarioTotalVenta=0;
        for (Prenda prenda : ListaPrenda) {
            double precio = prenda.calcularPrecioPrenda();
            double descuento = cliente.calcularPorcentajeDescuento();

            valorUnitarioTotalVenta += precio - (precio * descuento);
        }
        return valorUnitarioTotalVenta;
    }

    //toString

    @Override
    public String toString() {
        return "Venta{" +codigo +
                "\nfechaVenta=" + fechaVenta +
                "\ncliente=" + cliente +
                "\nvalorTotalVenta=" + valorTotalVenta + "\n";
    }
}