import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 28.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int count, number, max = 0, min = 0;

        System.out.print("How many count will you enter :");
        count = inp.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Enter the number :");
            number = inp.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }
            if (number >= max) {
                max = number;
            } else if (number <= min) {
                min = number;
            }
        }
        System.out.println("Max value :" + max);
        System.out.print("Min value :" + min);
    }
}