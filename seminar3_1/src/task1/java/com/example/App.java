package seminar3_1.src.task1.java.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] argsStrings )
    {      
        List<Item> itemList = new ArrayList<>(Arrays.asList(
            new Item("facol", "belarus", 10),
            new Item("makaron", "rusian", 12),
            new Item("facol", "belarus", 10),
            new Item("makaron", "rusian", 11)
        ));
        
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        List<String> countriList = new ArrayList<>();
        double allValue = 0.0;
        for (int i = 0; i < itemList.size(); i++) {
            if(itemList.get(i).getName().equals(searchName)){
                countriList.add(itemList.get(i).getCountru());
                allValue += itemList.get(i).getValue();
            }
            
        }
       System.out.println("countriList = " + countriList);
       System.out.println(allValue);
    }
}
