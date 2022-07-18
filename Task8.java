/***
 *
 * +Написать программу, показывающую последовательность действий для игры “Ханойская башня”
 */
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();       
        tower(n,'F','S','L');        
    }
    static void tower(int n, char first, char second, char last) {
        if(n == 1) {
            System.out.println(n + " from " + first + " to " + last);
            return;
        }
        tower(n-1, first, last, second);
        System.out.println(n + " from "+ first + " to " + last);
        tower(n-1, second, first, last);
    }    
}
