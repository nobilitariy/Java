package seminar5;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        System.out.println(flagArr(arr));
    }
        public static boolean flagArr(Integer[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if(map.containsKey(arr[i])){
                    return false;
                }
                map.put(arr[i], 1);
            }
            return true;     
    }
}
