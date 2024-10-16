package fes.aragon.inicio;

import fes.aragon.clases.NodoArbol;

public class Main {
    public static void main(String[] args) {
        NodoArbol<String> raiz = new NodoArbol<>("10");
        raiz.setHijoIzquierdo(new NodoArbol<>("5"));
        raiz.setHijoDerecho(new NodoArbol<>("15"));

        raiz.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>("1"));
        raiz.getHijoDerecho().setHijoDerecho(new NodoArbol<>("25"));

        System.out.println("Primer Arbol:");
        System.out.println(raiz);

        System.out.println(" ");

        NodoArbol<String> raiz2 = new NodoArbol<>("Diego");
        raiz2.setHijoIzquierdo(new NodoArbol<>("Pedro"));
        raiz2.setHijoDerecho(new NodoArbol<>("Mario"));

        raiz2.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>("Susan"));
        raiz2.getHijoIzquierdo().setHijoDerecho(new NodoArbol<>("Diana"));

        System.out.println("Segundo Arbol:");
        System.out.println(raiz2);
    }
}