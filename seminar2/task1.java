/*Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число. */

package seminar2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int koll = scanner.nextInt();
        int first = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i < koll; i++) {         
            int second = scanner.nextInt();
            if (first % 10 == 5 && second % 2 == 0) {
            summ += first;
            }
            first = second;
        }
        System.out.println(summ);
    }
    
}
