/**
 * Написать метод для зеркального переворота элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).
 */

import java.util.Arrays;

public class Homework4_9 {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4};
        int elements = list.length;

        for (int number = 0; number < list.length/2; number++) {
            int var = list[number];
            list[number] = list[--elements];
            list[elements] = var;
        }
        System.out.println(Arrays.toString(list));
    }
}
