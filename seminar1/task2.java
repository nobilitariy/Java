package seminar1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество чисел в последовательности: ");
        int number = scanner.nextInt();
        System.out.println(countN(number));
    }
    public static int countN(int number) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int first = scanner.nextInt();
        for (int i = 0; i < number-1; i++) {
            int second = scanner.nextInt();
            if (first > 0 && second < 0) {
                count += 1;
            }
            first = second;
        }
        return count;
    }
}
