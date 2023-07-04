import java.util.*;

/**
 Пусть дан произвольный список целых чисел.

 1) Нужно удалить из него чётные числа
 2) Найти минимальное значение
 3) Найти максимальное значение
 4) Найти среднее значение
 */

public class home3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        Fill(array);
        System.out.println(Arrays.toString(array));
        array = Even(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Min = " + array[0]);
        System.out.println("Max = " + array[array.length-1]);
        System.out.println("Middle = " + Middle(array));
    }

    public static void Fill(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    static int[] Even(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) count++;
        }
        int [] temp = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                temp[count] = array[i];
                count++;
            }
        }
        return temp;
    }

    public static int Middle(int[] array){
        int mid = ((array[array.length-1] - array[0]) / 2) + array[0];
        int i = 0;
        int middle = 0;
        while (array[i] < mid) i++;
        int min = array[i-1];
        int max = array[i];
        if (mid - min > max - mid) middle = max;
        else middle = min;
        return middle;
    }
}
