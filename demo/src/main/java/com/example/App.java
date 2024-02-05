package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] argsStrings )
    {
        Item item1 = new Item("facol", "belarus", 0);
        Item item2 = new Item("makaron", "rusian", 12);
        Item item3 = new Item("facol", "belarus", 10);
        Item item4 = new Item("makaron", "rusian", 11);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
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
