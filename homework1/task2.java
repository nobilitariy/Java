/*
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
 */

package homework1;

public class task2 {
    public static void main(String[] args) {
        System.out.println(2);
        System.out.println(3);
        for (int i = 5; i < 1001; i+=2) {
            boolean flag = true;
            for (int j = 3; j <= Math.sqrt(i)+1; j++) {
                
                if(i%j == 0){
                    flag = false;
                    break;
                }

                
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
    
}
