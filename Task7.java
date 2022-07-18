/*Написать метод, который проверяет валидность логина и пароля (где нибудь в переменных сохраните)
 * и при помощи конструкции try-catch рекурсивно принимайте данные (нужно ограничить колиичество
 * попыток до 6 и после 3 попытки должно быть сообщение, мол вы привысили количество попыток,
 * немного пододождите //тут можете поток заслипить на некоторое время. А когда попытки кончатся - выйти)
 */
import java.io.IOException;
import java.util.Scanner;

 public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        int count = 6;
        Verify(count);
    }

    public static void Verify(int n) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите логин: ");
            String lCheck = sc.nextLine();
            String log = "Mark";
            System.out.println("Введите пароль: ");
            String pCheck = sc.nextLine();
            String pas = "220883";
            if (lCheck.equals(log) && pCheck.equals(pas)) {
                System.out.println("Вы успешно вошли в систему!");
            } else {
                throw new IOException("Логин или пароль введены не верно!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            if (n == 3) {
                System.out.println("Вы превысили количесвто попыток, ждите 10 секунд!");
                Thread.sleep(10000);
            }
            if (n == 1) {
                System.out.println("Вход в систему заблокирован!");
                return;
            }
            Verify(n-1);
        }
    }
    
}
