/**
 * Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
 */

public class Homework4_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if ((i%3 == 0)){
                System.out.println(i);
            }
            
        }
    }
}
