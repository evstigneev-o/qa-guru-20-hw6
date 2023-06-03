import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int x = 150;
        int y = 115;
        //поупражняться с математически операторами +, -, *, /, % + попробовать вычисления комбинаций типов данных (int и double) + добиться переполнения при вычислениях
        System.out.println("сложение: " + (x + y));
        System.out.println("вычитание: " + (x - y));
        System.out.println("умножение: " + (x * y));
        System.out.println("деление c округлением до целого числа: " + (x / y));
        System.out.println("деление с результатом double: " + ((double) x / y));
        System.out.println("остаток от деления: " + (x % y));
        System.out.println("остаток от деления: " + (x % y));
        System.out.println("Инкремент префикс: " + ++x);
        System.out.println("Инкремент постфикс: " + y++);
        System.out.println("Декремент префикс: " + --x);
        System.out.println("Декремент постфикс: " + y--);
        System.out.println(600000 * 500000);
        //поупражняться с логическими операторами и if/else
        System.out.println(canIDrinkBeer());
        //switch case
        System.out.printf("Твоя оценка: %s!",gradeConverter(6));
    }

    public static String canIDrinkBeer() {
        LocalDateTime now = LocalDateTime.now();
        String dayOfWeek = now.getDayOfWeek().toString();
        int hour = now.getHour();
        if (dayOfWeek.equalsIgnoreCase("friday") && hour > 18) return "В этот пятничный вечер все бары твои";
        else if (dayOfWeek.equalsIgnoreCase("saturday")) return "Завтра воскресенье, не отказывай себе ни в чем!";
        else if (dayOfWeek.equalsIgnoreCase("sunday")) return "Чел, завтра на работу!!!";
        else return "Потерпи до вечера пятницы";
    }

    public static String gradeConverter(int grade) {
        String result;
        switch (grade) {
            case 1, 2, 3 -> result = "Неудовлетворительно";
            case 4, 5 -> result = "Удовлетворительно";
            case 6, 7, 8 -> result = "Хорошо";
            case 9, 10 -> result = "Отлично";
            default -> result = "Указана неверная оценка по десятибалльной шкале";
        }
        return result;
    }
}

