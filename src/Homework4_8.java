/**
 * С помощью консоли пользователь вводит математическое выражение типа “1+33-4*7”.
 * Написать программу для подсчета его значения.
 * Приоритет операций не учитывается.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class Homework4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mathematical expression(using spaces): ");
        String expression = scanner.nextLine();
        String[] arr = expression.split(" ");
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 1){
                n = Integer.parseInt(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
