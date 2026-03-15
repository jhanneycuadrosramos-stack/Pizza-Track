import java.util.Scanner;

public class GestionPedidos {

    Pila pilaPrincipal = new Pila();
    Pila pilaSecundaria = new Pila();

    Scanner scanner = new Scanner(System.in);

    public void registrarPizza() {

        System.out.print("Nombre de la pizza: ");
        String nombre = scanner.nextLine();

        String[] ingredientes = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrediente " + (i + 1) + ": ");
            ingredientes[i] = scanner.nextLine();
        }

        Pizza pizza = new Pizza(nombre, ingredientes);

        pilaPrincipal.push(pizza);

        System.out.println("Pedido registrado y enviado a la cocina.");
    }

    public void deshacer() {

        Pizza pizza = pilaPrincipal.pop();

        if (pizza == null) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        pilaSecundaria.push(pizza);

        System.out.println("Se deshizo el último pedido.");
    }

    public void rehacer() {

        Pizza pizza = pilaSecundaria.pop();

        if (pizza == null) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        pilaPrincipal.push(pizza);

        System.out.println("El pedido fue restaurado correctamente.");
    }

    public void mostrarPedidoActual() {

        Pizza pizza = pilaPrincipal.peek();

        if (pizza == null) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        pizza.mostrarPizza();
    }
}