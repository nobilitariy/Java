package seminar3_2.src.main.java.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам. Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Student> stList = new ArrayList<>(Arrays.asList(
            new Student("ova", 1, 100.34, Arrays.asList(5,4,5)),
            new Student("ova", 1, 100.34, Arrays.asList(5,5,5)),
            new Student("ova", 1, 104.54, Arrays.asList(5,6,5))
            ));
            for (Student elem : stList) {
                if(getchet(elem.getBalc()) && elem.getFamilia().endsWith("ova")){
                    System.out.println(elem.getCtipendia());
                }
            }
    }
    public static boolean getchet(List<Integer> balc){
        int sum = 0;
        for (Integer integer : balc) {
            sum += integer;
        }
        return sum%2 == 0;
    }
}
