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
            System.out.println("6. Mostrar ingresos generados por sucursal");

            System.out.println("----- VENTAS -----");
            System.out.println("7. Agregar venta");
            System.out.println("8. Mostrar valor unitario total de la venta");
            System.out.println("9. Mostrar ventas realizadas por vendedor");
            System.out.println("10. Mostrar compras realizadas por un cliente");
            System.out.println("11. Mostrar la prenda más vendida de toda la empresa");

            System.out.println("0. Salir del Menú");

            System.out.println("Seleccione la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar buffer

            switch (opcion) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

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
