package seminar1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverb(str));
    }
    public static String reverb(String str) {
        String firstStr = str.substring(0, str.length()/2);
        String secondStr = str.substring(str.length()/2);
        return secondStr+firstStr;
    }

}