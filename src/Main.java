public class Main {
    public static void main(String[] args) {
        // Объявляем переменную для хранения стоимости билета
        int ticketPrice = 13676; // Пример: стоимость билета 13676 рублей

        // Объявляем переменную для хранения количества рублей для одной бонусной мили
        int rublesPerMile = 20;

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Выводим результат на экран
        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}
