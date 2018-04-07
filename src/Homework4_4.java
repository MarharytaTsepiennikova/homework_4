/**
 * Дано массив из 10 целых чисел. Вывести на экран сумму всех его элементов кроме первого и последнего.
 */

public class Homework4_4 {
    public static void main(String[] args) {
        int[] list = {1, -78, 8, 78, 65, 777, 9, -2, 32, -714};
        int sum = 0;
        for (int i = 0; i < list.length-1; i++) {
            if (i != 0 && i!= list.length-1) {
                sum += list[i];
            }
        }
        System.out.println(sum);
    }
}


