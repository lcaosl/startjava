public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.");
        byte numberSystem = 7;
        System.out.println("Операционная система Windows " + numberSystem + ".");
        short typeSystem = 64;
        System.out.println(typeSystem + " - разрядная операционная система.");
        int ram = 14680064;
        System.out.println("Объем оперативной памяти " + ram + " КБ.");
        long unknownParameter = 26455589654l;
        System.out.println("Не понятное мне значение - " + unknownParameter + ".");
        float lastUpdate = 2.04_2023f;
        System.out.println("Последнее обновление системы: " + lastUpdate + ".");
        double processor = 2.67;
        System.out.println("Частота процессора " + processor + "GHz.");
        char systemDisk = 'C';
        System.out.println("Система установлена на диск " + systemDisk + ".");
        boolean isWork = true;
        if (isWork) {
            System.out.println("Компьютер включен.");
        }

        System.out.println("\n2. Расчет стоимости товара со скидкой.");
        double penPrice = 100;
        double bookPrice = 200;
        double allPrice = penPrice + bookPrice;
        double discount = (allPrice / 100) * 11;
        double discountPrice = allPrice - discount;
        System.out.println("Общяя стоимость товаров без скидки: " + allPrice + " рублей.");
        System.out.println("Сумма скидки: " + discount + " рубля.");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " рублей.");

        System.out.println("\n3. Вывод слова JAVA.");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов.");
        byte maxByte = 127;
        System.out.println("Первоначальное значение: " + maxByte);
        maxByte += 1;
        System.out.println("Значение после инкремента на единицу: " + maxByte);
        maxByte -= 1;
        System.out.println("Значение после декремента на единицу: " + maxByte);
        short maxShort = 32767;
        System.out.println("Первоначальное значение: " + maxShort);
        maxShort += 1;
        System.out.println("Значение после инкремента на единицу: " + maxShort);
        maxShort -= 1;
        System.out.println("Значение после декремента на единицу: " + maxShort);
        int maxInt = 2147483647;
        System.out.println("Первоначальное значение: " + maxInt);
        maxInt += 1;
        System.out.println("Значение после инкремента на единицу: " + maxInt);
        maxInt -= 1;
        System.out.println("Значение после декремента на единицу: " + maxInt);
        long maxLong = 9223372036854775807l;
        System.out.println("Первоначальное значение: " + maxLong);
        maxLong += 1;
        System.out.println("Значение после инкремента на единицу: " + maxLong);
        maxLong -= 1;
        System.out.println("Значение после декремента на единицу: " + maxLong);

        System.out.println("\n5. Перестановка значений переменных.");
        System.out.println("\nС помощью третьей переменной:");
        int firstNum = 2;
        int secondNum = 5;
        int tmp = firstNum;
        System.out.println("Исходные значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");
        firstNum = secondNum;
        secondNum = tmp;
        System.out.println("Новые значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");

        System.out.println("\nС помощью арифметических операций.");
        System.out.println("Исходные значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");
        firstNum += secondNum;
        secondNum = firstNum - secondNum;
        firstNum -= secondNum;
        System.out.println("Новые значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");

        System.out.println("\nС помощью побитовой операции ^.");
        System.out.println("Исходные значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");
        firstNum ^= secondNum;
        secondNum = firstNum ^ secondNum;
        firstNum ^= secondNum;
        System.out.println("Новые значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");

        System.out.println("\n6.Вывод символов и их кодов.");
        char sharp = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println(sharp + " - " + (int) sharp);
        System.out.println(ampersand + " - " + (int) ampersand);
        System.out.println(at + " - " + (int) at);
        System.out.println(caret + " - " + (int) caret);
        System.out.println(underscore + " - " + (int) underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.");
        char forwardSlash = '/';
        char backSlash = '\\';
        char open = '(';
        char close = ')';
        System.out.println("    " + forwardSlash + backSlash);
        System.out.println("   " + forwardSlash + "  " + backSlash);
        System.out.println("  " + forwardSlash + underscore + open + " " + close + backSlash);
        System.out.println(" " + forwardSlash + "      " + backSlash );
        System.out.println("" + forwardSlash + underscore + underscore + underscore + underscore + forwardSlash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.");
        int number = 123;
        int hundreds = number / 100;
        int tens = number /10 % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит: ");
        System.out.println("Сотен: " + hundreds + ", десятков: " + tens + ", единиц: " + ones + ".");
        System.out.println("Сумма цифр: " + sum + ", произведение: " + product + ".");

        System.out.println("\n9. Вывод времени.");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int lastSeconds = (seconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + lastSeconds);
    }
}