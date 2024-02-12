/*
 ввод: s = "MCMXCIV"
вывод: 1994
разбор: M = 1000, CM = 900, XC = 90 and IV = 4.

 */
package seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>(Map.of(
        'I', 1,
        'V', 5, 
        'X', 10, 
        'L', 50, 
        'C', 100, 
        'D', 500, 
        'M', 1000
        ));
        // Scanner scanner = new Scanner(System.in);
        String str = "MCMXCIV";
        int sum = map.get(str.charAt(str.length()-1));
        // for (int i = 0; i < str.length(); i++) {
        //     sum += map.get(str.charAt(i));
        // }
        // System.out.println(sum);
        
        for (int i = 0; i < str.length() - 1; i++) {
            if(map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
                sum -= map.get(str.charAt(i));
            } else{
            sum += map.get(str.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
