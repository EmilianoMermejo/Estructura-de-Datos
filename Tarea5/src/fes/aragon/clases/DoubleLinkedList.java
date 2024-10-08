package fes.aragon.clases;

public class DoubleLinkedList<T> {
    private NodoDoble<T> head ;
    private NodoDoble<T> tail;
    private int direccion;
    private int tamanio;

    public DoubleLinkedList() {
    }

    public boolean estaVacio() {
        boolean resultado = false;
        if(this.head == null && this.tail == null){
            System.out.println("La lista esta vacia");
            return true;
        }
        System.out.println("La lista no esta vacia");
        return resultado;
    }

    public int getTamanio(){
        return tamanio;
    }

    public void agregarAlInicio (T valor){
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        NodoDoble<T> aux = this.head;

        if(aux == null){
            this.head = nuevo;
            this.tail = nuevo;
        }else {
            this.head.setAnterior(nuevo);
            nuevo.setSiguiente(this.head);
            this.head = nuevo;
        }
        tamanio++;
    }

    public void agregarAlFinal (T valor){
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        NodoDoble<T> aux = this.head;

        if(aux == null){
            this.head = nuevo;
            this.tail = nuevo;
        }else {
            this.tail.setSiguiente(nuevo);
            nuevo.setAnterior(this.tail);
            this.tail = nuevo;
        }
        tamanio++;
    }

    public void agregarDespuesDe (T referencia , T valor){
        NodoDoble<T> aux = this.head;
        while (aux != null){
            if(aux.getDato().equals(referencia)){
                NodoDoble<T> nuevo = new NodoDoble<>(valor);
                nuevo.setSiguiente(nuevo.getSiguiente());
                nuevo.setAnterior(aux);
                if(aux.getSiguiente() != null){
                    aux.getSiguiente().setAnterior(nuevo);
                }else{
                    this.tail = nuevo;
                }
                aux.setSiguiente(nuevo);
                tamanio++;
                return;
            }
            aux = aux.getSiguiente();
        }
        System.out.println("No se encontro la referencia");
    }

    public T obtener (int posicion){
        if (posicion < 0 || posicion >= tamanio){
            System.out.println("fuera del rango");
        }

        NodoDoble<T> aux = this.head;
        for (int i = 0; i < posicion; i++) {
            aux = aux.getSiguiente();
        }
        return aux.getDato();
    }

    public void eliminarElPrimero() {
        if (this.head == null) {
            System.out.println("No hay elementos por eliminar");
            return;
        }

        this.head = head.getSiguiente();
        if (this.head != null) {
            this.head.setAnterior(null);
        } else {
            this.tail = null;
        }
        tamanio--;
    }

    public void eliminarElFinal() {
        if (this.tail == null) {
            System.out.println("No hay elementos por eliminar");
            return;
        }

        this.tail = tail.getAnterior();
        if (this.tail != null) {
            this.tail.setSiguiente(null);
        } else {
            this.head = null;
        }
        tamanio--;
    }

    public void eliminar(int posicion) {
        if (posicion < 0 || posicion >= tamanio) {
            System.out.println("Elemento fuera del rango");
            return;
        }

        if (this.head == null) {
            System.out.println("No hay elementos por eliminar");
            return;
        }

        if (posicion == 0) {
            eliminarElPrimero();
        } else if (posicion == tamanio - 1) {
            eliminarElFinal();
        } else {
            NodoDoble<T> aux = this.head;
            for (int i = 0; i < posicion; i++) {
                aux = aux.getSiguiente();
            }
            aux.getAnterior().setSiguiente(aux.getSiguiente());
            if (aux.getSiguiente() != null) {
                aux.getSiguiente().setAnterior(aux.getAnterior());
            }
        }
        tamanio--;
    }

    public int buscar(T valor){
        NodoDoble<T> aux = this.head;
        int indice = 1;
        while (aux != null){
            if(aux.getDato().equals(valor)){
                return indice;
            }
            aux=aux.getSiguiente();
            indice++;
        }
        System.out.println("No se encontro el elemento");
        return -1;
    }

    public void actualizar (T aBuscar , T valor){
        NodoDoble<T> aux = this.head;
        while (aux != null) {
            if (aux.getDato().equals(aBuscar)) {
                aux.setDato(valor);
                return;
            }
            aux = aux.getSiguiente();
        }
        System.out.println("No se encontro el elemento");

    }

    public void transversal(int direccion) {
        if (direccion == 0) {
            NodoDoble<T> aux = this.head;
            while (aux != null) {
                System.out.println(aux.getDato());
                aux = aux.getSiguiente();
            }
        } else {
            NodoDoble<T> aux = this.tail;
            while (aux != null) {
                System.out.println(aux.getDato());
                aux = aux.getAnterior();
            }
        }
    }
}