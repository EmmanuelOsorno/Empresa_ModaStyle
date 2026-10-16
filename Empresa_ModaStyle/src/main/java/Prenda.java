public class Prenda {
    private String codigo;
    private String nombre;
    private String marca;
    private double precioUnitario;
    private CategoriaPrenda categoriaPrenda;
    private TallaPrenda tallaPrenda;
    private TallaCalzado tallaCalzado;

    //
    public Prenda(String codigo, String nombre, String marca, double precioUnitario, CategoriaPrenda categoriaPrenda, TallaPrenda tallaPrenda, TallaCalzado tallaCalzado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.categoriaPrenda = categoriaPrenda;
        this.tallaPrenda = tallaPrenda;
        this.tallaCalzado = tallaCalzado;
    }

    //
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public CategoriaPrenda getCategoriaPrenda() {
        return categoriaPrenda;
    }

    public void setCategoriaPrenda(CategoriaPrenda categoriaPrenda) {
        this.categoriaPrenda = categoriaPrenda;
    }

    public TallaPrenda getTallaPrenda() {
        return tallaPrenda;
    }

    public void setTallaPrenda(TallaPrenda tallaPrenda) {
        this.tallaPrenda = tallaPrenda;
    }

    public TallaCalzado getTallaCalzado() {
        return tallaCalzado;
    }

    public void setTallaCalzado(TallaCalzado tallaCalzado) {
        this.tallaCalzado = tallaCalzado;
    }

    //metodo calcular valor de prenda segun la categoria
    public double calcularPrecioPrenda(){
        double valorPrenda=precioUnitario+(precioUnitario*categoriaPrenda.getRecargo());
        return valorPrenda;
    }

    //toString


    @Override
    public String toString() {
        return "Prenda " + codigo +
                "\nnombre: " + nombre +
                "\nmarca: '" + marca +
                "\nprecioUnitario: " + precioUnitario +
                "\ncategoriaPrenda: " + categoriaPrenda +
                "\ntallaPrenda: " + tallaPrenda +
                "\ntallaCalzado: " + tallaCalzado +"\n";
    }
}
