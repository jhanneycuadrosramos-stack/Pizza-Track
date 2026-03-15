import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {

            System.out.println("\n- PEDIDOS DE PIZZERIA -");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer pedido");
            System.out.println("3. Rehacer pedido");
            System.out.println("4. Mostrar pedido actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    gestion.registrarPizza();
                    break;

                case 2:
                    gestion.deshacer();
                    break;

                case 3:
                    gestion.rehacer();
                    break;

                case 4:
                    gestion.mostrarPedidoActual();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

scanner.close();

}
}