package seminar4;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> lL = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            lL.add(scanner.nextInt());  
        }
        scanner.close();
    }
}
