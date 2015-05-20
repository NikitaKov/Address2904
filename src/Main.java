import java.util.Scanner;

/**
 * Created by student on 29.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        AddressBook book1=new AddressBook ();
//        Address Ivan=new Address ("Иван","999000","email");
//        book1.add (Ivan);
//        book1.printAll ();
        Scanner s=new Scanner (System.in);
        while (true) {
            System.out.println("1. Добавление записи (дополнительно запрашивается имя, телефон и e-mail)\n" +
                    "2. Поиск записей (дополнительно запрашиватеся имя для поиска)\n" +
                    "3. Вывод всех записей\n" +
                    "4. Удаление записи (дополнительно запрашивается индекс записи для удаления)\n" +
                    "5. Изменение записи (дополнительно запрашивается индекс изменяемой записи, новые имя, телефон и e-mail)\n" +
                    "6. Выход из программы");
            int command=s.nextInt();
            switch (command){
                case 1:
                    System.out.println("Введите имя новой записи");
                    String name=s.next ();
                    System.out.println("Введите телефон");
                    String phone=s.next ();
                    System.out.println("Введите адресс электронной почты");
                    String email=s.next ();
                    Address newAddr=new Address(name, phone, email);
                    book1.add (newAddr);
                    break;
                case 2:
                    break;
                case 3:
                    book1.printAll ();
                    break;
                case 4:
                    System.out.println("Введите номер записи");
                    int indexdlete=s.nextInt ();
                    book1.delete(indexdlete);
                    break;
                case 5:
                    System.out.println("Введите номер записи для изменения:");
                    int indexedit=s.nextInt ();
                    System.out.println("Введите имя новой записи");
                    String nameedit=s.next ();
                    System.out.println("Введите телефон");
                    String phoneedit=s.next ();
                    System.out.println("Введите адресс электронной почты");
                    String emailedit=s.next ();
                    book1.edit(indexedit, nameedit, phoneedit, emailedit);
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        }
    }
}
