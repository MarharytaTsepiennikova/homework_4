/**
 * Вывести на экран числа от 10 до 20 с помощью всех известных циклов.
 */

public class Homework4_1{
    public static void main(String[] args) {
        for (int i = 10; i < 21; i++) {
            System.out.println(i);
        }
        System.out.println();

        int number = 10;
        while(number < 21){
            System.out.println(number);
            number++;
        }
        System.out.println();

        int rez = 10;
        do {
            System.out.println(rez);
            rez++;
        }while (rez <= 20);
    }
}
