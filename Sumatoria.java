public class Sumatoria {
    public static void main (String[] args) {
        Integer numeros[] = {6,7,5,4,3,1,2,3,5,6,7,9,0,0,1,2,4,1,2,3,5,1,2};
        suman(numeros);
    }

    public static void suman(Integer[] array) {

        int sum = 0;
        int i = 0;        
        
        while (i < array.length ) {
            sum = array[i];

            for (int f = i+1; f < array.length ;  f++) {
                sum += array[f];

                if (sum == 13) {
                    System.out.printf("Loss elementos entre (%d, %d) suman 13\n", i , f);
                    break;
                } else if (sum > 13) {
                    break;
                }

            }
            i++;
        }
    }

}