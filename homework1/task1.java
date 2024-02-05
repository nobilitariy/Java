/* Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.
*/

package homework1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println(-1);
            
        }

        else System.out.println(treygName(number));
    }

    public static int treygName(int number) {
        int count = 1;
        for (int i = 2; i <= number; i++) {
            count += i;
            
        }
        return count;
        
    }
    

}
