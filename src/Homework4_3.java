/**
 * Заполнить массив числами от 100 до 0.
 */

import java.util.Arrays;

public class Homework4_3 {
    public static void main(String[] args) {
        int[] list = new int [101];
        for (int number = list.length-1; number >= 0; number--) {
            list[number] = number;
        }
        System.out.println(Arrays.toString(list));
    }
}
