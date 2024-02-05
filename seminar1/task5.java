package seminar1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int[] array = new int[scanner.nextInt()];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();            
            }
            
            int[] array2 = arrayMod(array);
            for (int i = 0; i < array2.length; i++) {
                System.out.println(array2[i]);
                
            }
    
    }
    public static int[] arrayMod(int[] args) {
        int[] array2 = new int[args.length];
        array2[0] = args[0];
        for (int i = 1; i < array2.length; i++) {
            array2[i] = array2[i-1]+ args[i];
            
        }
        return array2;
    }
}
