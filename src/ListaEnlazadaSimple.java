package src;

public class ListaEnlazadaSimple<T> {
    private Nodo<T> cabeza;

    public ListaEnlazadaSimple() {
        this.cabeza = null;
    }

    public boolean estaVacia() {
        return this.cabeza == null;
    }

    public void insertarAlInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = this.cabeza;
        this.cabeza = nuevo;
    }

    public void insertarAlFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            this.cabeza = nuevo;
            return;
        }
        Nodo<T> actual = this.cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    public boolean buscar(T dato) {
        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int contarNodos() {
        int contador = 0;
        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("Lista vacia (null)");
            return;
        }
        Nodo<T> actual = this.cabeza;
        String resultado = "";
        while (actual != null) {
            resultado += "[" + actual.dato + "] -> ";
            actual = actual.siguiente;
        }
        resultado += "null";
        System.out.println(resultado);
    }
}