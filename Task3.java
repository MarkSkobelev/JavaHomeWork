/***
 * У вас есть отсортированный массив (Можете сами сгенерировать и использовать
 * любой удобный вам алгоритм сортировки (кроме пузырька)), нужно используя
 * минимальное колличество попыток найти загаданное число (Алгоритм бинарного поиска )
 */
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 50: ");
        int number = sc.nextInt();
        int[] genArray = arrCreate();
        ShowArray(genArray);
        genArray = arrSort(genArray);
        ShowArray(genArray);
        int pos = iterativeSearch(genArray, number);
        if (pos < 0 ){
            System.out.println("Число в данном массиве не найдено");
        }else {
            System.out.println(pos);
        }
    }
    public static int[] arrCreate(){
        int[] array = new int[50];
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++)
        {
            array[i] = rnd.nextInt(50);
        }
        return array;
    }
    public static int[] arrSort(int[] array){
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i+1] = array[i];
                } else {
                    break;
                }
            }
            array[i+1] = value;
        }
        return array;
    }
    public static void ShowArray(int[] array) {
        int counter = 0;
        while(counter < array.length) {
            System.out.printf("%d ", array[counter]);
            counter++;
        }
        System.out.println(" ");

    }

    public static int iterativeSearch(int[] arrayToSearch, int element) {
        int lowIndex = 0;
        int highIndex = arrayToSearch.length-1;
        int elementPos = -1;
        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (element == arrayToSearch[midIndex]) {
                elementPos = midIndex;
                break;
            } else if (element < arrayToSearch[midIndex]) {
                highIndex = midIndex-1;
            } else if (element > arrayToSearch[midIndex]) {
                lowIndex = midIndex+1;
            }
        }
        return elementPos;
    }
}
