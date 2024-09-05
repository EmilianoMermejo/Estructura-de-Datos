package fes.aragon.clases;

public class ListaLigada<T> {
    private Nodo<T> head;
    private int tamanio;

    public ListaLigada() {
    }

    public void transversal(){
        Nodo<T> aux = this.head;
        while (aux != null){
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }

    public boolean estaVacia(){
        if (this.head == null) {
            System.out.println("Esta Vacia");
            return true;
        }
        System.out.println("No Esta Vacia");
        return false;
    }

    public int getTamanio(){
        Nodo aux = this.head;
        int contador = 0;
        while (aux!=null){
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    public void agregarAlFinal(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if(head == null){
            head = nuevo;
        }else {
            Nodo<T> aux = this.head;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void agregarAlInicio(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        this.head = new Nodo<>(dato, this.head);
    }

    public void agregarDespuesDe (Nodo<T> referencia, T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if (referencia != null){
            nuevo.setSiguiente(referencia.getSiguiente());
            referencia.setSiguiente(nuevo);
        }
    }

    public void eliminar (int posicion){
        if(this.head == null || posicion < 0){
            return;
        }
        if (posicion == 0){
            this.head = this.head.getSiguiente();
            return;
        }

        Nodo<T> actual = this.head;
        for(int i = 0 ; i < posicion -1 && actual != null; i++){
            actual = actual.getSiguiente();

        }
        if (actual == null || actual.getSiguiente() == null){
            return;
        }
        actual.setSiguiente(actual.getSiguiente().getSiguiente());
    }

    public void eliminarElPrimer(){
        if(this.head != null){
            this.head = this.head.getSiguiente();
        }
    }

    public void eliminarelFinal(){
        Nodo<T> aux = this.head;
        while(aux.getSiguiente().getSiguiente() !=null){
            aux.getSiguiente();
        }
        aux.setSiguiente(null);
    }

    public int buscar (T dato ){
        Nodo<T> aux = this.head;
        int posicion = 0 ;
        while (aux != null){
            if(aux.getDato().equals(dato)){
                return posicion;
            }
            aux = aux.getSiguiente();
            posicion++;
        }
        return -1;
    }

    public void actualizar (int posicion , T dato){
        Nodo<T> aux = this.head;
        int posicion1 = 0 ;
        while (aux != null){
            if(posicion1 == posicion){
                aux.setDato(dato);
                return;
            }
            aux = aux.getSiguiente();
            posicion1++;
        }
    }
}