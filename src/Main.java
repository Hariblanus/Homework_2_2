public class Main {
    public static void main(String[] args) {
        int balancePaymentAmount = 3000; // Сумма пополнения
        int initialBalance = 160; // Баланс клиента до пополнения
        int bonus = 0; //Количество бонусов
        int rubPer1Bonus = 100; // Минимальная сумма пополнения для получения 1 бонусного рубля
        if (balancePaymentAmount >= 1000) {
            bonus = balancePaymentAmount / rubPer1Bonus;
        }
        int totalBalance = initialBalance + balancePaymentAmount + bonus;
        System.out.println("Ваш баланс: " + totalBalance + " рублей.");
        System.out.println("Начислено " + bonus + " бонусных рублей.");
    }
}
