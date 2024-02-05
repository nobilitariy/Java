/* Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго */


package seminar2;

public class task2 {
    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 2, 2, 1, 1};
        int count = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i-1] / arr[i+1] == 2){
                count ++;
            }
        }
        System.out.println(count);
        
    }
    
}
