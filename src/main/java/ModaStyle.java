import java.util.*;

public class ModaStyle {

    private String nombreComercial;
    private String direccion;
    private int NIT;

    //listas

    private List<Sucursal> listaSucursales;
    private List<Prenda> listaPrendas;


    //Constructor

    public ModaStyle(String nombreComercial, String direccion, String NIT) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.NIT = NIT;

        //listas

        listaSucursales = new ArrayList<>();
        listaPrendas = new ArrayList<>();


        //GET Y SET


        public String getNombreComercial () {
            return nombreComercial;
        }
        public void setNombreComercial (String nombreComercial){
            this.nombreComercial = nombreComercial;
        }

        public String getDireccion () {
            return direccion;
        }

        public void setDireccion (String direccion){
            this.direccion = direccion;
        }

        public int getNIT () {
            return NIT;
        }

        public void setNIT ( int NIT){

            this.NIT = NIT;
        }


        //registrar una prenda

        //registrar una nueva sucursal


        //identificar la referencia de prenda con mayor ventas













    }
}