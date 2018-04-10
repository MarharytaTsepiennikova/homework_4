/**
 * Найти в массиве чисел элементы с наибольшим и наименьшим значениями
 */

public class Homework4_6 {
    public static void main(String[] args) {
        int[] list = {43, 89, -23, 22, -43, 12, 9, 0};
        int min = 0, max = 0;

        for (int elements = 0; elements < list.length-1; elements++) {
            if (list[elements] > max){
                max = list[elements];
            }
            if (list[elements] < min){
                min = list[elements];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
