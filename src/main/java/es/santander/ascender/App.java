package es.santander.ascender;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ArbolOrdenado arbol = new ArbolOrdenado();

        // Insertar valores
        arbol.insertar(7);
        arbol.insertar(3);
        arbol.insertar(5);
        arbol.insertar(12);
        arbol.insertar(8);
        arbol.insertar(1);

        arbol.recorrerEnOrden();

        System.out.println("¿Existe el valor 2 en el árbol? " + arbol.buscar(2)); 
        System.out.println("Insertamos el numero 2 que NO existe"); 
        arbol.insertar(2);

        System.out.println("Insertamos el numero 3 que YA existe"); 
        arbol.insertar(3);

        arbol.recorrerEnOrden();
    }
}
