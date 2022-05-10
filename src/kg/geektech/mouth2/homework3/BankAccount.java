package kg.geektech.mouth2.homework3;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Вы пополнили счёт на: " + sum);

    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма больше чем денег на счете: ", amount);
        } else {
            amount -= sum;
            System.out.println("Снято: " + sum + " Остаток: " + amount);
        }
    }

}
