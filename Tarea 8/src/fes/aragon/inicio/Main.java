package fes.aragon.inicio;

import fes.aragon.clases.ClienteBanco;
import fes.aragon.clases.ColaConPrioridadAcotada;

public class Main {
    public static void main(String[] args) {
        ColaConPrioridadAcotada<ClienteBanco> clientes = new ColaConPrioridadAcotada<>(5);
        //1
        clientes.encolar(4, new ClienteBanco("Jose Luis Hernandez" , 4));
        clientes.encolar(4, new ClienteBanco("Andrea Clara Lopez" , 4));
        //2
        clientes.encolar(5, new ClienteBanco("Antonio Jesus Andrade" , 5));
        clientes.encolar(5, new ClienteBanco("Ana Lorena Hernandez" , 5));
        clientes.encolar(5, new ClienteBanco("Cesar Uriel Flores" , 5));
        //3
        clientes.encolar(1, new ClienteBanco("Amala Zandile Dlamini" , 1));
        //4
        System.out.println("COLA DEL BANCO CON PRIORIDAD ACOTADA: ");
        System.out.println(clientes);
        //5
        System.out.println("Accion del cliente: ");
        System.out.println(clientes.desencolar().retirarDinero(10000));
        //6
        clientes.encolar(3, new ClienteBanco("Eva Paloma Espinoza", 3));
        clientes.encolar(2, new ClienteBanco("Alondra Esmeralda Krol", 2));
        //7
        System.out.println();
        System.out.println("Cliente a Atender: ");
        System.out.println(""+ clientes.desencolar());
        System.out.println();
        //8
        System.out.println("COLA DEL BANCO CON PRIORIDAD ACOTADA:");
        System.out.println(clientes);
        //9
        System.out.println("Cliente a Atender: " + clientes.desencolar());
        System.out.println("Cliente a Atender: " + clientes.desencolar());
        System.out.println("Cliente a Atender: " + clientes.desencolar());
        System.out.println("Cliente a Atender: " + clientes.desencolar());
        System.out.println("Cliente a Atender: " + clientes.desencolar());
        System.out.println("Cliente a Atender: " + clientes.desencolar());
        //10
        System.out.println();
        System.out.println("COLA DEL BANCO CON PRIORIDAD ACOTADA: ");
        System.out.println(clientes);
        System.out.println("SIN CLIENTES DEL BANCO");
    }
}
