import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать игру "Крестики нолики"? используя двухмерные массивы
 */
public class Homework4_5 {
    public static void main(String[] args) {
        String[][] list = {{"*", "*", "*"} , {"*", "*", "*"}, {"*", "*", "*"}};
        boolean gamerun = true;
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (gamerun){
            draw(list);
            System.out.println("Enter column: ");
            int cl= scanner.nextInt();
            System.out.println("Enter line: ");
            int line = scanner.nextInt();
            count++;
            System.out.println(count);
            if (count%2==0){
                if (list[cl][line].equals("*")) {
                    list[line][cl] = "0";
                }
                else {
                    count--;
                }
            }
            else {
                if(list[cl][line].equals("*")) {
                    list[line][cl] = "x";
                }
                else {
                    count--;
                }
            }
        }
    }
    static void draw(String[][] list){
        for (int i = 0; i < list.length; i++) {
                System.out.println(Arrays.toString(list[i]));
        }
    }

}
