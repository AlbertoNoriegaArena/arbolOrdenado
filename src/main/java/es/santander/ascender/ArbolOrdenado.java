package es.santander.ascender;

public class ArbolOrdenado {

    public Nodo raiz;

    public ArbolOrdenado() {
        this.raiz = null;
    }

    // Método para insertar un valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        // Si no hay numero en el nodo
        if (nodo == null) {
            return new Nodo(valor);
        }
        // Menores por la izquierda
        if (valor < nodo.numero) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        // Mayores por la derecha
        } else if (valor > nodo.numero) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        }
        return nodo;
    }

    // Método para buscar un valor en el árbol
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo nodo, int valor) {
        // No existe nodo
        if (nodo == null) {
            return false;
        }
        if (valor == nodo.numero) {
            return true;
        }
        // si es menor => izquierda
        if (valor < nodo.numero) {
            return buscarRecursivo(nodo.izquierda, valor);
        }
        // Por defecto devuelve derecha
        return buscarRecursivo(nodo.derecha, valor);
    }

    // Recorrer el arbol en orden (primero izquierda luego derecha)
    public void recorrerEnOrden() {
        recorrerEnOrdenRecursivo(raiz);
        System.out.println();
    }

    private void recorrerEnOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrdenRecursivo(nodo.izquierda);
            System.out.print(nodo.numero + " ");
            recorrerEnOrdenRecursivo(nodo.derecha);
        }
    }
}
