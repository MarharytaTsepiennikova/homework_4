/**
 * Найти в массиве число, которое повторяется наибольшее количество раз. Не использовать коллекции
 */
public class Homework4_7 {
    public static void main(String[] args) {
        int[] list = {3, 54, 6, -8, 4, -8, 1, -8};
        int var = 0, num = 0, rez = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]){
                    var++;
                }
                if (var > num);
                num = var;
                rez = list[i];
            }
        }
        System.out.println(rez);
    }
}
