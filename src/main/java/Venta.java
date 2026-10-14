import java.time.LocalDate;

public class Venta {
    private String codigo;
    private LocalDate fechaVenta;

    //
    public Venta(String codigo, LocalDate fechaVenta) {
        this.codigo = codigo;
        this.fechaVenta = fechaVenta;
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

    //

    @Override
    public String toString() {
        return "Venta{" +
                "codigo='" + codigo + '\'' +
                ", fechaVenta=" + fechaVenta +
                '}';
    }
}
