package src;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();
        
        // 1. Inserciones al inicio y al final
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(10);
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);
        
        // 2. Recorrido y visualización de la lista
        System.out.print("Contenido de la lista: ");
        lista.mostrarLista();
        
        // 3. Conteo total de nodos
        System.out.println("Total de nodos: " + lista.contarNodos());
        
        // 4. Verificación de búsqueda lineal
        System.out.println("¿Existe el 30?: " + lista.buscar(30));
        System.out.println("¿Existe el 99?: " + lista.buscar(99));
    }
}
