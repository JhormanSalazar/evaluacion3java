import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] nombresProductos = {"Papa", "Cebolla", "Carne de cerdo", "Bubaloo", "Arroz", "Manzanas"};
        Integer[] cantidadProductos = {12, 9, 5, 20, 5, 18};
        Scanner sc = new Scanner(System.in);

        /* MENU DEL SUPERMERCADO */
        String response = "";
        do {
            System.out.println();
            System.out.println();
            System.out.println("******Bienvenido al supermercado de jhorman******");
            System.out.println("Digite la opcion deseada: ");
            System.out.println("A: Buscar un producto por nombre y mostrar su cantidad disponible.");
            System.out.println("B: Mostrar el producto con mayor cantidad disponible.");
            System.out.println("C: Mostrar productos con menos de 10 unidades.");
            System.out.println("D: Salir");
            response = sc.nextLine();

            switch (response) {
                case "A":
                    opcionA(nombresProductos, cantidadProductos, sc);
                    break;
                case "B":
                    opcionB(cantidadProductos, nombresProductos);
                    break;
                case "C":
                    opcionC(cantidadProductos, nombresProductos);
                    break;
                case "D":
                    System.out.println("*****Saliendo*****");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese una que exista...");
                    break;
            }
        } while (!response.equals("D"));

        sc.close();
    }


    /* METODOS DEL MENU */
    static void opcionA(String[] nombresProductos, Integer[] cantidadProductos, Scanner sc) {
        System.out.println("Digite el nombre del producto a buscar: ");
        String nombreProducto = sc.nextLine();
        buscarProducto(nombresProductos, cantidadProductos, nombreProducto);
    }

    static void buscarProducto(String[] nombresProductos, Integer[] cantidadProductos, String nombreProducto) {
        boolean encontrado = false;
        for (int i = 0; i < nombresProductos.length; i++) {
            if (nombresProductos[i].equalsIgnoreCase(nombreProducto)) {
                System.out.println("Producto encontrado!, nombre: " + nombresProductos[i] + " cantidad: " + cantidadProductos[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado...");
        }
    }

    static void opcionB(Integer[] cantidadProductos, String[] nombresProductos) {
        Integer cantidadMayor = 0;
        int indiceProductoMayor = 0;
        for (int i = 0; i < cantidadProductos.length; i++) {
            if (cantidadMayor < cantidadProductos[i]) {
                cantidadMayor = cantidadProductos[i];
                indiceProductoMayor = i;
            }
        }
        System.out.println("El producto que tiene mas cantidad disponible es: " + nombresProductos[indiceProductoMayor] + " y su cantidad es: " + cantidadMayor);
    }

    static void opcionC(Integer[] cantidadProductos, String[] nombresProductos) {
        int indice = 0;
        for (int i = 0; i < nombresProductos.length; i++) {
            if (cantidadProductos[i] < 10) {
                indice = i;
                System.out.println("El producto: " + nombresProductos[i] + " tiene menos de 10 unidades disponibles.");
            }
        }
    }
}
