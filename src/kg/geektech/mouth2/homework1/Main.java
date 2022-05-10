package kg.geektech.mouth2.homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        while (true){
            System.out.println("Введите имя");
            String name = scanner.next();
            try {
                user.setName(name);
                System.out.println("Успешно! Ваше имя " + user.getName());
                System.out.println("Введите возраст");
                Integer age = scanner.nextInt();
                user.setAge(age);
                System.out.println("Успешно! Ваш возраст " + user.getAge());
            } catch (IllegalNameLengthException e){
                System.out.println("Ошибка!" + e.getMessage());
            } catch (IllegalAgeException ie) {
                System.out.println("Ошибка!" + ie.getMessage());

            }
        }


    }
}
