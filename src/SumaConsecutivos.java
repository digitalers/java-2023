package src;

import java.sql.Array;
import java.util.ArrayList;

public class SumaConsecutivos {
    public static void main(String[] args) {
    sumar(13);
    }
    public static void sumar(int ref){
        int[] numeros = {6,7,5,4,3,1,2,3,5,6,7,9,0,0,1,2,4,1,2,3,5,1,2};
        int cont = -1;
        for (int numero:numeros) {
            cont += 1;
            int acum = 0;
            for (int i = cont; i < numeros.length; i++) {
                acum += numeros[i];
                if (acum == 13){
                    System.out.println("Los elementos entre ("+cont+","+i+")"+" suman "+ref+" elementos");
                    break;
                } else if (acum >13) {
                    break;
                }
            }
        }


    }
}
