import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    static void main () {
        Scanner scanner = new Scanner(System.in);


        int opcion;
        do {
            System.out.println("\nMenú\n=====MODASTYLE=====");

            System.out.println("----- CLIENTES -----");
            System.out.println("1. Agregar cliente");

            System.out.println("----- EMPLEADOS -----");
            System.out.println("2. Agregar empleado");

            System.out.println("----- PRENDAS -----");
            System.out.println("3. Agregar prenda");
            System.out.println("4. Mostrar prendas de una sucursal");
            System.out.println("5. Mostrar prendas agotadas");

            System.out.println("----- SUCURSALES -----");
            System.out.println("6. Agregar sucursal");
            System.out.println("7. Mostrar ingresos generados por sucursal");

            System.out.println("----- VENTAS -----");
            System.out.println("8. Agregar venta");
            System.out.println("9. Mostrar valor unitario total de la venta");
            System.out.println("10. Mostrar ventas realizadas por vendedor");
            System.out.println("11. Mostrar compras realizadas por un cliente");
            System.out.println("12. Mostrar la prenda más vendida de toda la empresa");

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

                case 3:
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

                case 4:
                    System.out.println("----- PRENDAS -----");



                    break;

                case 5:
                    System.out.println("----- PRENDAS -----");


                    break;

                case 6:
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

                case 7:
                    System.out.println("----- SUCURSALES -----");


                    break;

                case 8:
                    System.out.println("----- VENTAS -----");


                    break;

                case 9:
                    System.out.println("----- VENTAS -----");


                    break;

                case 10:
                    System.out.println("----- VENTAS -----");


                    break;

                case 11:
                    System.out.println("----- VENTAS -----");


                    break;

                case 12:
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
