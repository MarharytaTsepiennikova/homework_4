/**
 * Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
 */

public class Homework4_2 {
    public static void main(String[] args) {
        for (int numbers = 0; numbers < 101; numbers++) {
            if ((numbers%3 == 0)){
                System.out.println(numbers);
            }
            
        }
    }
}
