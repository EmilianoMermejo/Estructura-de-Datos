package fes.aragon.clases;

import java.util.Arrays;

public class MergeSort  {
    public static void mergeSort(int[] data) {
        if (data.length > 1){

            int mitad = data.length / 2;
            int [] izquierda = Arrays.copyOfRange(data, 0, mitad);
            int [] derecha = Arrays.copyOfRange(data, mitad, data.length);

            System.out.println(Arrays.toString(izquierda) + "--------" + Arrays.toString(derecha));
            mergeSort(izquierda);
            mergeSort(derecha);

            int i = 0 , d= 0 , k = 0;
            while (i < izquierda.length && d < derecha.length){
                if (izquierda[i] < derecha [d]){
                    data [k++] = izquierda[i++];
                } else {
                    data [k++] = derecha [d++];
                }
            }

            while (i < izquierda.length) {
                data[k++] = izquierda[i++];
            }

            while (d < derecha.length) {
                data[k++] = derecha[d++];
            }
        }
        System.out.println("Regreso de Rec: " + Arrays.toString(data));

    }
}