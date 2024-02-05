package seminar1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(rasnost(number));
    }

    public static int rasnost(int number) {

        int proisv = 1;
        int summ = 0;
        while (number != 0) {
            proisv *= number % 10;
            summ += number % 10;
            number /= 10;
        }
        return proisv - summ;
    }
}