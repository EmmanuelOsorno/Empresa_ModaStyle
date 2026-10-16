import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ModaStyle modaStyle= new ModaStyle("ModaStyle","Armenia,Quindío",1090275723);
        int opcion;

        do {
            System.out.println("\nMenú\n=====MODASTYLE=====");

            System.out.println("----- CLIENTES -----");
            System.out.println("1. Agregar cliente");//si
            System.out.println("2. Mostrar cliente");//si

            System.out.println("----- EMPLEADOS -----");
            System.out.println("3. Agregar empleado");//si
            System.out.println("4. Mostrar empleados");//si

            System.out.println("----- PRENDAS -----");
            System.out.println("5. Agregar prenda");//si
            System.out.println("6. Mostrar prendas");//si
            System.out.println("7. Mostrar prendas de una sucursal");//si
            System.out.println("8. Mostrar prendas agotadas");//si

            System.out.println("----- SUCURSALES -----");
            System.out.println("9. Agregar sucursal");//si
            System.out.println("10. Mostrar sucursales");//si
            System.out.println("11. Mostrar ingresos generados por sucursal");//si

            System.out.println("----- VENTAS -----");
            System.out.println("12. Agregar venta");//si
            System.out.println("13. Mostrar ventas");//si
            System.out.println("14. Mostrar ventas realizadas por vendedor");// si
            System.out.println("15. Mostrar compras realizadas por un cliente");//si
            System.out.println("16. Mostrar la prenda más vendida de toda la empresa");//si

            System.out.println("0. Salir del Menú");

            System.out.println("Seleccione la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("----- CLIENTES -----");


                    System.out.print("Documento: ");
                    int documento = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    int telefono = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Codigo de afiliacion: ");
                    String codigoAfiliacion = scanner.nextLine();

                    System.out.println("Categoria del ciente: ");
                    CategoriaCliente categoriaCliente = CategoriaCliente.valueOf(scanner.nextLine());//diferencia

                    Cliente cliente = new Cliente(documento, nombre, correo, telefono, codigoAfiliacion, categoriaCliente);

                    if (ModaStyle.agregarCliente(cliente)) {
                        System.out.println("Cliente agregado correctamente");
                    } else {
                        System.out.println("El cliente ya existe");
                    }

                    break;

                case 2:
                    System.out.println("----- CLIENTES -----");//Si da error se elimina

                    for (Cliente ListaCliente : ModaStyle.getListaCliente()) { // acá lo relaciona con modaStyle
                        System.out.println(ListaCliente);
                    }

                    break;

                case 3:
                    System.out.println("----- EMPLEADOS -----");


                    System.out.print("Documento de empleado: ");
                    int documentoEmpleado = scanner.nextInt();//esta solo documento

                    System.out.print("Nombre: ");
                    String nombreEmpleado = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correoEmpleado = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    int telefonoEmpleado = scanner.nextInt();
                    scanner.nextLine();

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
                    scanner.nextLine();

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    Empleado empleado = new Empleado(documentoEmpleado, nombreEmpleado, correoEmpleado, telefonoEmpleado, codigoEmpleado, fechaContratacion, salario);

                    if (ModaStyle.agregarEmpleado(empleado)) {
                        System.out.println("Empleado agregado correctamente");
                    } else {
                        System.out.println("El empleado ya existe");
                    }

                    break;

                case 4:
                    System.out.println("----- EMPLEADOS -----");//diferencia

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
                    scanner.nextLine();

                    System.out.print("Seleccione la ctegoria de la prenda: ");

                    CategoriaPrenda[] categorias = CategoriaPrenda.values();

                    for (int i = 0; i < categorias.length; i++) {
                        System.out.println((i + 1) + ". " + categorias[i]);
                    }

                    System.out.print("Opción categoría: ");
                    int opcionCategoria = scanner.nextInt();

                    scanner.nextLine();

                    CategoriaPrenda categoriaPrenda = categorias[opcionCategoria - 1];

                    TallaPrenda tallaPrenda = null;
                    TallaCalzado tallaCalzado = null;

                    if (categoriaPrenda == CategoriaPrenda.CALZADO) {

                        System.out.println("\nSeleccione talla de calzado:");

                        TallaCalzado[] tallasCalzado = TallaCalzado.values();

                        for (int i = 0; i < tallasCalzado.length; i++) {
                            System.out.println((i + 1) + ". " + tallasCalzado[i]);
                        }

                        System.out.print("Opción talla: ");
                        int opcionTalla = scanner.nextInt();

                        scanner.nextLine();

                        tallaCalzado = tallasCalzado[opcionTalla - 1];

                    } else {

                        System.out.println("\nSeleccione talla de prenda:");

                        TallaPrenda[] tallasPrenda = TallaPrenda.values();

                        for (int i = 0; i < tallasPrenda.length; i++) {
                            System.out.println((i + 1) + ". " + tallasPrenda[i]);
                        }

                        System.out.print("Opción talla: ");
                        int opcionTalla = scanner.nextInt();

                        scanner.nextLine();

                        tallaPrenda = tallasPrenda[opcionTalla - 1];
                    }

                    Prenda prenda = new Prenda(
                            codigo,
                            nombrePrenda,
                            marca,
                            precioUnitario,
                            categoriaPrenda,
                            tallaPrenda,
                            tallaCalzado
                    );

                    if (ModaStyle.agregarPrenda(prenda)) {
                        System.out.println("Prenda agregada correctamente.");
                    } else {
                        System.out.println("Ya existe una prenda con ese código.");
                    }

                    break;

                case 6:
                    System.out.println("----- PRENDAS -----");//diferencia

                    for(Prenda ListaPrendas: ModaStyle.getListaPrendas()){
                        System.out.println(ListaPrendas);
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
                    System.out.println("----- SUCURSALES -----");//diferencia

                    for(Sucursal ListaSucursales: ModaStyle.getListaSucursales()){
                        System.out.println(ListaSucursales);
                    }

                    break;

                case 11:
                    for (Sucursal sucursalIngresos : ModaStyle.getListaSucursales()) {
                        System.out.println(sucursalIngresos.getNombre() + " - Ingresos: $" + sucursalIngresos.calcularIngresosTotales());
                    }
                    break;

                case 12://FALTA
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
                    scanner.nextLine(); //cambio

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

                    double valorTotalVenta = 0.0;// provicional
                    Venta venta= new Venta (codigoVenta, fechaVenta, clienteDeVenta, valorTotalVenta);//a codigo le quite venta(no sirvio)

                    if(Empleado.agregarVenta(venta)) {
                        System.out.println("Venta agregada correctamente");
                    }
                    else {
                        System.out.println("La Venta no pudo agregarse");
                    }

                    break;

                case 13:
                    System.out.println("----- VENTAS -----");//diferente

                    for(Venta ListaVenta: ModaStyle.getListaVenta()){
                        System.out.println(ListaVenta);
                    }

                    break;


                case 14:
                    System.out.println("----- VENTAS -----");


                    break;

                case 15:
                    System.out.println("----- VENTAS -----");
                    System.out.println("Documento del cliente:");
                    int documentoCliente = scanner.nextInt();
                    scanner.nextLine();

                    Cliente clienteEncontrado = null;

                    for (Cliente clienteActual : ModaStyle.getListaCliente()) {
                        if (clienteActual.getDocumento() == documentoCliente) {
                            clienteEncontrado = clienteActual;
                            break;
                        }
                    }

                    if (clienteEncontrado == null) {
                        System.out.println("No se encontró el cliente.");
                    } else if (clienteEncontrado.getListaVenta().isEmpty()) {
                        System.out.println("El cliente no tiene compras registradas.");
                    } else {
                        for (Venta ventaRealizada : clienteEncontrado.getListaVenta()) { //por ahora voy a deja venta así
                            System.out.println(ventaRealizada.getCodigo() + " - " + ventaRealizada.getFechaVenta() + " - Total: $" + ventaRealizada.getValorTotalVenta());
                        }
                    }
                    break;

                case 16:
                    System.out.println("----- VENTAS -----");
                    Prenda prendaMasVendida = ModaStyle.buscarPrendaMasVendida();

                    if (prendaMasVendida == null) {
                        System.out.println("Todavía no hay ventas registradas.");
                    } else {
                        System.out.println(
                                "Prenda más vendida: " +
                                        prendaMasVendida.getNombre() +
                                        " - Código: " + prendaMasVendida.getCodigo()
                        );
                    }
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
