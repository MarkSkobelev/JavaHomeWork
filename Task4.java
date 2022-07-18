/***
 * Написать метод, который будет эмулировать работу динамического массива
 * (Без исопользования коллекций), протестировать можно при выводе
 * последовательности треугольного числа до n
 */

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        sc.close();
        for (int i = 1; i <= number; i++) {
            res = (i * (i + 1)) / 2;
            arr = arrayAppend(arr, res);
        }
        System.out.println("Создан массив чисел: " + Arrays.toString(arr));
    }
    public static int[] arrayAppend(int[] array, int triangularNumber) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = triangularNumber;
        return newArray;
    }
}