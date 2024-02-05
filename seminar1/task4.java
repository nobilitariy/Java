package seminar1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();            
        }
        System.out.println(simetric(array));
    }
    public static boolean simetric(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-1-i]) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}
