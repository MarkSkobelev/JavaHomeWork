/*Написать программу возрващающее число, которе без остатка делится на сумма цифр этого числа. */
import java.util.Scanner;

public class Task2 {
    public static int findSum(int number) {
        int sum;
        for (sum = 0; number > 0; sum = sum + number % 10, number = number / 10);
        return sum;
    }
    public static int ostDel (int number, int sum) {
        int x = number % sum;
        return x;
    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");  
        number = sc.nextInt();          
        System.out.println("Сумма чисел: "+ findSum(number));
        int sum = findSum(number);
        if (ostDel(number, sum) == 0){
            System.out.println("Остаток от деления: "+ ostDel(number, sum));  
            System.out.println("Число делится без остатка на сумму своих цифр");
        }
        else{
            System.out.println("Остаток от деления: "+ ostDel(number, sum));  
            System.out.println("Число Не делится без остатка!");
        }
        
    }
}