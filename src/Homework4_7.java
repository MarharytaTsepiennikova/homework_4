/**
 * Найти в массиве число, которое повторяется наибольшее количество раз. Не использовать коллекции
 */
public class Homework4_7 {
    public static void main(String[] args) {
        int[] list = {3, 54, 6, -8, 4, -8, 1, -8};
        int n = 0, m = 0, rez = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]){
                    n++;
                }
                if (n > m);
                m = n;
                rez = list[i];
            }
        }
        System.out.println(rez);
    }
}
