/**
 * Вывести на экран 0-й, 14-й и 27-й элементы массива.
 */

public class Homework_4 {

    public static void main(String[] args) {
	int[] x = new int[28];

        for (int element = 0; element < x.length; element++) {
            x[element] = element * 635;
            if(element == 0 || element == 14 || element == 27){
                System.out.println(x[element]);
            }
        }
    }
}
