package kg.geektech.mouth2.homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Вводите сумму: " );
        double money = scanner.nextInt();
        bankAccount.deposit(money);
        while (true){
            try {
                System.out.print("Выводимая сумма: ");
                bankAccount.withDraw(scanner1.nextInt());
            }catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                try {
                    bankAccount.withDraw((int) limitException.getRemainingAmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}