package fes.aragon.inicio;

import fes.aragon.clases.ListaLigada;
import fes.aragon.clases.SmartPhone;

public class Main {
    public static void main(String[] args) {
        ListaLigada<SmartPhone> celulares = new ListaLigada<>();

        celulares.agregarAlInicio(new SmartPhone(1,"Iphone" , 2015, 8 , 128 , "Azul"));
        celulares.agregarAlFinal(new SmartPhone(2,"Samsung" , 2022, 12 , 64 , "Verde"));
        celulares.agregarAlFinal(new SmartPhone(3,"Motorola" , 2024, 12 , 256 , "Negro"));
        celulares.agregarAlFinal(new SmartPhone(4,"Huawei" , 2021, 12 , 256 , "Blanco"));
        celulares.agregarAlFinal(new SmartPhone(5,"Xiaomi" , 2019, 8 , 64 , "Gris"));
        ListaLigada<SmartPhone> respaldo = celulares;

        System.out.println("Lista Inicial: ");
        celulares.transversal();

        celulares.eliminar(1);
        System.out.println("Lista Actualizada: Se Elimino el dispositivo 2");
        celulares.transversal();

        respaldo.actualizar(1,new SmartPhone(2, "OPPO" , 2022 , 16,256,"Rosa"));
        System.out.println("Lista actualizada: Actualizamos los datos del SmartPhone 2");
        respaldo.transversal();

        celulares.agregarAlInicio(new SmartPhone(1,"Google" , 2024, 16,128 , "Blanco"));
        celulares.agregarAlFinal(new SmartPhone(6,"Honor",2021,8,128,"Negro"));
        System.out.println("Lista Actualizada: Se agregaron dos SmartPhone nuevos en el inicio y al final de la lista");
        celulares.transversal();

        celulares.eliminarElPrimer();
        System.out.println("Lista Actualizada : Se Elimino el primer SmartPhone de la lista");
        celulares.transversal();
    }
}