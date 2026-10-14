public enum CategoriaPrenda {
    CAMISETA(0),
    PANTALON(0),
    VESTIDO(0.10),
    CHAQUETA(0.15),
    CALZADO(0.05);


    private double recargo;

    //Constructor
    CategoriaPrenda(double recargo) {
        this.recargo = recargo;
    }
    //Metodo para obtener el porcentaje de recargo

    public double getRecargo() {
        return recargo;
    }







}
