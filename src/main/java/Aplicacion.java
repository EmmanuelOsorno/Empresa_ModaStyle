import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcion;
        do {
            System.out.println("\nMenú\n=====MODASTYLE=====");

            System.out.println("----- CLIENTES -----");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Mostrar cliente");

            System.out.println("----- EMPLEADOS -----");
            System.out.println("3. Agregar empleado");
            System.out.println("4. Mostrar empleados");

            System.out.println("----- PRENDAS -----");
            System.out.println("5. Agregar prenda");
            System.out.println("6. Mostrar prendas");
            System.out.println("7. Mostrar prendas de una sucursal");
            System.out.println("8. Mostrar prendas agotadas");

            System.out.println("----- SUCURSALES -----");
            System.out.println("9. Agregar sucursal");
            System.out.println("10. Mostrar sucursales");
            System.out.println("11. Mostrar ingresos generados por sucursal");

            System.out.println("----- VENTAS -----");
            System.out.println("12. Agregar venta");
            System.out.println("13. Mostrar ventas");
            System.out.println("14. Mostrar valor unitario total de la venta");
            System.out.println("15. Mostrar ventas realizadas por vendedor");
            System.out.println("16. Mostrar compras realizadas por un cliente");
            System.out.println("17. Mostrar la prenda más vendida de toda la empresa");

            System.out.println("0. Salir del Menú");

            System.out.println("Seleccione la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("----- CLIENTES -----");


                    System.out.print("Documento: ");
                    int documento = scanner.nextInt();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    int telefono = scanner.nextInt();

                    System.out.print("Codigo de afiliacion: ");
                    String codigoAfiliacion = scanner.nextLine();

                    System.out.println("Categoria del ciente: ");
                    CategoriaCliente categoriaCliente= CategoriaCliente.valueOf(scanner.nextLine());

                    Cliente cliente = new Cliente(documento, nombre, correo, telefono, codigoAfiliacion,categoriaCliente);

                    if(ModaStyle.agregarCliente(cliente)) {
                        System.out.println("Cliente agregado correctamente");
                    }
                    else {
                        System.out.println("El cliente ya existe");
                    }

                    break;

                case 2:
                    System.out.println("----- CLIENTES -----");

                    for(Cliente ListaCliente: ModaStyle.getListaCliente()){
                        System.out.println(ListaCliente);
                    }

                    break;

                case 3:
                    System.out.println("----- EMPLEADOS -----");


                    System.out.print("Documento: ");
                    int documentoEmpleado = scanner.nextInt();

                    System.out.print("Nombre: ");
                    String nombreEmpleado = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correoEmpleado = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    int telefonoEmpleado = scanner.nextInt();

                    System.out.print("Codigo de empleado: ");
                    String codigoEmpleado = scanner.nextLine();

                    System.out.println("Fecha de contratación");
                    System.out.print("Ingrese el año: ");
                    int año = scanner.nextInt();
                    System.out.print("Ingrese el mes: ");
                    int mes = scanner.nextInt();
                    System.out.print("Ingrese el dia: ");
                    int dia = scanner.nextInt();
                    LocalDate fechaContratacion = LocalDate.of(año, mes, dia);

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();

                    Empleado empleado=new Empleado(documentoEmpleado,nombreEmpleado,correoEmpleado,telefonoEmpleado,codigoEmpleado,fechaContratacion,salario );

                    if(ModaStyle.agregarEmpleado(empleado)) {
                        System.out.println("Empleado agregado correctamente");
                    }
                    else {
                        System.out.println("El empleado ya existe");
                    }

                    break;

                case 4:
                    System.out.println("----- EMPLEADOS -----");

                    for(Empleado ListaEmpleado: ModaStyle.getListaEmpleado()){
                        System.out.println(ListaEmpleado);
                    }

                    break;

                case 5:
                    System.out.println("----- PRENDAS -----");


                    System.out.print("Código de la prenda: ");
                    String  codigo = scanner.nextLine();

                    System.out.print("Nombre de la prenda: ");
                    String nombrePrenda = scanner.nextLine();

                    System.out.print("Marca de la prenda: ");
                    String marca = scanner.nextLine();

                    System.out.print("Precio unitario de la prenda: ");
                    double precioUnitario = scanner.nextDouble();

                    System.out.print("Categoria de la prenda: ");
                    CategoriaPrenda categoriaPrenda= CategoriaPrenda.valueOf(scanner.nextLine());

                    System.out.print("Talla de la prenda: ");
                    TallaPrenda tallaPrenda=TallaPrenda.valueOf(scanner.nextLine());

                    System.out.print("Talla del calzado: ");
                    TallaCalzado tallaCalzado=TallaCalzado.valueOf(scanner.nextLine());

                    Prenda prenda=new Prenda(codigo, nombrePrenda, marca, precioUnitario, categoriaPrenda, tallaPrenda, tallaCalzado);

                    if(ModaStyle.agregarPrenda(prenda)) {
                        System.out.println("Prenda agregada correctamente");
                    }
                    else {
                        System.out.println("La prenda ya existe");
                    }

                    break;

                case 6:
                    System.out.println("----- PRENDAS -----");

                    for(Prenda ListaPrenda: ModaStyle.getListaPrenda()){
                        System.out.println(ListaPrenda);
                    }

                    break;

                case 7:
                    System.out.println("----- PRENDAS -----");


                    break;

                case 8:
                    System.out.println("----- PRENDAS -----");


                    break;

                case 9:
                    System.out.println("----- SUCURSALES -----");

                    System.out.print("Código de sucursal: ");
                    String codigoSucursal = scanner.nextLine();

                    System.out.print("Nombre de la sucursal: ");
                    String nombreSucursal = scanner.nextLine();

                    System.out.print("Direccion: ");
                    String direccion = scanner.nextLine();

                    System.out.print("Cuidad donde se ubica la sucursal: ");
                    String cuidad = scanner.nextLine();

                    Sucursal sucursal= new Sucursal(codigoSucursal, nombreSucursal, direccion,cuidad);

                    if(ModaStyle.agregarSucursal(sucursal)) {
                        System.out.println("Sucursal agregada correctamente");
                    }
                    else {
                        System.out.println("La sucursal ya existe");
                    }

                    break;

                case 10:
                    System.out.println("----- SUCURSALES -----");

                    for(Sucursal ListaSucursal: ModaStyle.getListaSucursal()){
                        System.out.println(ListaSucursal);
                    }

                    break;

                case 11:
                    System.out.println("----- SUCURSALES -----");


                    break;

                case 12:
                    System.out.println("----- VENTAS -----");

                    System.out.print("Código de venta: ");
                    String codigoVenta = scanner.nextLine();

                    System.out.print("Fecha de la venta: ");
                    System.out.print("Ingrese el año: ");
                    int añoVenta = scanner.nextInt();
                    System.out.print("Ingrese el mes: ");
                    int mesVenta = scanner.nextInt();
                    System.out.print("Ingrese el dia: ");
                    int diaVenta = scanner.nextInt();
                    LocalDate fechaVenta = LocalDate.of(añoVenta, mesVenta, diaVenta);

                    System.out.print("Cliente: ");

                    System.out.print("Documento: ");
                    int documento2 = scanner.nextInt();

                    System.out.print("Nombre: ");
                    String nombre2 = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correo2 = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    int telefono2 = scanner.nextInt();

                    System.out.print("Codigo de afiliacion: ");
                    String codigoAfiliacion2 = scanner.nextLine();

                    System.out.println("Categoria del ciente: ");
                    CategoriaCliente categoriaCliente2= CategoriaCliente.valueOf(scanner.nextLine());

                    Cliente clienteDeVenta=new Cliente(documento2,nombre2,correo2,telefono2,codigoAfiliacion2,categoriaCliente2);


                    Venta venta= new Venta (codigoVenta, fechaVenta, clienteDeVenta);

                    if(ModaStyle.agregarVenta(venta)) {
                        System.out.println("Venta agregada correctamente");
                    }
                    else {
                        System.out.println("La Venta no pudo agregarse");
                    }

                    break;

                case 13:
                    System.out.println("----- VENTAS -----");

                    for(Venta ListaVenta: ModaStyle.getListaVenta()){
                        System.out.println(ListaVenta);
                    }

                    break;

                case 14:
                    System.out.println("----- VENTAS -----");


                    break;

                case 15:
                    System.out.println("----- VENTAS -----");


                    break;

                case 16:
                    System.out.println("----- VENTAS -----");


                    break;

                case 17:
                    System.out.println("----- VENTAS -----");


                    break;


                case 0:
                    System.out.println("Menú cerrado");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }
        while (opcion != 0);
        scanner.close();
    }
}
