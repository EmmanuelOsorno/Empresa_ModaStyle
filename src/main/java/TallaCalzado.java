public enum TallaCalzado {
    TALLA_35(35),
    TALLA_36 (36),
    TALLA_37(37),
    TALLA_38(38),
    TALLA_39(39),
    TALLA_40(40),
    TALLA_41(41),
    TALLA_42(42),
    TALLA_43(43),
    TALLA_44(44);

    private int valor;

    TallaCalzado(int valor) {
        this.valor = valor;
    }

    //get

    public int getValor() {
        return valor;
    }
}
