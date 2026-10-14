public enum CategoriaCliente {
    BRONCE(0.05),
    PLATA(0.10),
    ORO(0.15);

    private double porcentajeDescuento;

    //Constructor

    CategoriaCliente(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //Metodo

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}
