import java.util.ArrayList;
import java.util.List;

public class RangosConsecutivos {

        
    public static List<String> encontrarRangosConsecutivos(int[] array, int objetivo) {
        List<String> rangos = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int suma = array[i];
            String rango = String.valueOf(array[i]);

            for (int j = i + 1; j < array.length; j++) {
                suma += array[j];
                rango += " + " + array[j];

                if (suma == objetivo) {
                    rangos.add(rango);
                    break;
                } else if (suma > objetivo) {
                    break;
                }
            }
        }

        return rangos;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int objetivo = 13;

        List<String> rangos = encontrarRangosConsecutivos(array, objetivo);

        if (rangos.isEmpty()) {
            System.out.println("No se encontraron rangos de números consecutivos que sumen " + objetivo);
        } else {
            System.out.println("Los siguientes rangos de números consecutivos suman " + objetivo + ":");
            for (String rango : rangos) {
                System.out.println(rango);
            }
        }
    }
}