/**
 * Заполнить массив числами от 100 до 0.
 */

import java.util.Arrays;

public class Homework4_3 {
    public static void main(String[] args) {
        int[] list = new int [100];
        for (int i = list.length; i <= 0; i--) {
            list[i] = i;
        }
        System.out.println(Arrays.toString(list));
    }
}