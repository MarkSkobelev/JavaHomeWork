/*Создать карту (Map), будет хранить в себе данные телефонной
 * книги (Фамилии и телефонные номера), если будут дубликаты фамилий,
 * то должны выводиться оба номера (если помним Map не может хранить дубликаты,
 * будет заменять номер телефона по ключу, нужно подумать как не допустить такого)
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

 public class Task6 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> phones = new ArrayList<>();
        phones.add("8-911-954-0022");
        phones.add("8-911-954-5455");
        map.put("Utkin", phones);

        phones = new ArrayList<>();
        phones.add("8-911-955-9875");
        map.put("Koshkin", phones);
       
        phones = new ArrayList<>();
        phones.add("8-911-989-6542");
        phones.add("8-911-989-6524");
        map.put("Soloviev", phones);

        for (Map.Entry<String, ArrayList<String>> item: map.entrySet()) {
            System.out.println(item.getKey() + "-"+ item.getValue());
        }
    }
}
