package fes.aragon.clases;

public class Pila<T> {

    private Nodo<T> tope;
    private int tamano;

    private static class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
        }
    }

    public Pila() {
        tope = null;
        tamano = 0;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public int length() {
        return tamano;
    }

    // Método para añadir un elemento a la pila (push)
    public void push(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
        tamano++;
    }

    // Método para sacar el elemento en la cima de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T elemento = tope.dato;
        tope = tope.siguiente;
        tamano--;
        return elemento;
    }

    // Método para ver el elemento en la cima de la pila sin eliminarlo (peek)
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return tope.dato;
    }
}