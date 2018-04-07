/**
 * Найти в массиве чисел элементы с наибольшим и наименьшим значениями
 */

public class Homework4_6 {
    public static void main(String[] args) {
        int[] list = {43, 89, -23, 22, -43, 12, 9, 0};
        int min = 0, max = 0;

        for (int i = 0; i < list.length-1; i++) {
            if (list[i] > max){
                max = list[i];
            }
            if (list[i] < min){
                min = list[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
