import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYLIST_INVENTARIO {
public static void main(String[] args) {

ArrayList<String> listaproductos = new ArrayList<>();
ArrayList<Double> listaprecios = new ArrayList<>();
ArrayList<Integer> listacantidad = new ArrayList<>();

Scanner scanner = new Scanner(System.in);

while (true) {

System.out.println("\nMenú:");
System.out.println("1. Agregar producto");
System.out.println("2. Actualizar inventario");
System.out.println("3. Buscar producto");
System.out.println("4. Mostrar inventario");
System.out.println("5. Salir");
System.out.print("Seleccione una opción: ");

int opcion = scanner.nextInt();
scanner.nextLine(); 

switch (opcion) {


//AGREGAR PRODUCTO NUEVO
case 1:
System.out.print("Ingrese el nombre del producto: ");
String nombre = scanner.nextLine();
System.out.print("Ingrese el precio del producto: ");
Double precio = scanner.nextDouble();
System.out.print("Ingrese la cantidad de stock del producto: ");
Integer cantidad = scanner.nextInt();

    if (!listaproductos.contains(nombre)) {
        listaproductos.add(nombre);
        listaprecios.add(precio);
        listacantidad.add(cantidad);
        System.out.println("Producto agregado correctamente.");
        } else {
        System.out.println("El producto ya existe.");
        }

System.out.println(listaproductos);
break;


//MODIFICAR UN PRODUCTO YA REGISTRADO
case 2:
System.out.println("Lista de productos: ");
System.out.println(listaproductos);

System.out.print("Ingrese el producto que desea actualizar: ");
String actualizar = scanner.nextLine();

int indice = listaproductos.indexOf(actualizar);

System.out.println("Desea modificar el nombre del producto: S/N");
String sino = scanner.nextLine();
        if ("S".equalsIgnoreCase(sino) || "s".equalsIgnoreCase(sino)) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombreact = scanner.nextLine();
            listaproductos.set(indice, nombreact);
        } else {
            System.out.println("El nombre no sera modificado");
        }

System.out.print("Ingrese el precio del producto: ");
Double precioact = scanner.nextDouble();
System.out.print("Ingrese la cantidad de stock del producto: ");
Integer cantidadact = scanner.nextInt();

listaprecios.set(indice, precioact);
listacantidad.set(indice, cantidadact);

System.out.println("Producto actualizado: " + actualizar);
System.out.println("Nombre: " + listaproductos.get(indice));
System.out.println("Precio: " + listaprecios.get(indice));
System.out.println("Cantidad: " + listacantidad.get(indice));
break;


//BUSCAR Y VER INFORMACION SOBRE UN PRODUCTO YA REGISTRADO
case 3:
System.out.println("Lista de productos: ");
System.out.println(listaproductos);

System.out.print("Ingrese el producto que esta buscando: ");
String buscar = scanner.nextLine();

int indicebuscar = listaproductos.indexOf(buscar);

System.out.println("Nombre: " + listaproductos.get(indicebuscar));
System.out.println("Precio: " + listaprecios.get(indicebuscar));
System.out.println("Cantidad: " + listacantidad.get(indicebuscar));
break;


//MOSTRAR INVENTARIO COMPLETO CON TODA LA INFO DE CADA PRODUCTO
case 4:
System.out.println("INVENTARIO");

int contador = 0;

for(int i = 0; i<listaproductos.size(); i++){
    System.out.println("NOMBRE: " + listaproductos.get(contador) + "   , " + "PRECIO: " + listaprecios.get(contador) + "   , " + "CANTIDAD: " + listacantidad.get(contador));
    contador ++;
}
break;
                

case 5:
System.out.println("Saliendo del programa.");
scanner.close();
System.exit(0);
default:

System.out.println("Opción inválida. Intente de nuevo.");

}
}
}
}
