public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.");
        byte numberOfSystem = 7;
        System.out.println("Операционная система Windows " + numberOfSystem + ".");
        short typeOfSystem = 64;
        System.out.println(typeOfSystem + " - разрядная операционная система.");
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
        boolean isItWork = true;
        if (isItWork) {
            System.out.println("Компьютер включен.");
        }

        System.out.println("\n2. Расчет стоимости товара со скидкой.");
        double pen = 100;
        double book = 200;
        double allPrice = pen + book;
        double discount = (allPrice / 100) * 11;
        double lastPrice = allPrice - discount;
        System.out.println("Общяя стоимость товаров без скидки: " + allPrice + " рублей.");
        System.out.println("Сумма скидки: " + discount + " рубля.");
        System.out.println("Общая стоимость товаров со скидкой: " + lastPrice + " рублей.");

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
        int thirdNum;
        System.out.println("Исходные значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");
        thirdNum = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;
        System.out.println("Новые значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");

        System.out.println("\nС помощью арифметических операций.");
        System.out.println("Исходные значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println("Новые значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");

        System.out.println("\nС помощью побитовой операции ^.");
        System.out.println("Исходные значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");
        firstNum ^= secondNum;
        secondNum = firstNum ^ secondNum;
        firstNum ^= secondNum;
        System.out.println("Новые значения переменных: firstNum = " + firstNum + ", secondNum = " + secondNum + ".");

        System.out.println("\n6.Вывод символов и их кодов.");
        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';
        int codeCh1 = ch1;
        int codeCh2 = ch2;
        int codeCh3 = ch3;
        int codeCh4 = ch4;
        int codeCh5 = ch5;
        System.out.println(ch1 + " - " + codeCh1);
        System.out.println(ch2 + " - " + codeCh2);
        System.out.println(ch3 + " - " + codeCh3);
        System.out.println(ch4 + " - " + codeCh4);
        System.out.println(ch5 + " - " + codeCh5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.");
        char ch6 = '/';
        char ch7 = '\\';
        char ch8 = '(';
        char ch9 = ')';
        System.out.println("    " + ch6 + ch7 + "     ");
        System.out.println("   " + ch6 + "  " + ch7 + "    ");
        System.out.println("  " + ch6 + ch5 + ch8 + " " + ch9 + ch7 + "    ");
        System.out.println(" " + ch6 + "      " + ch7 + "  ");
        System.out.println("" + ch6 + ch5 + ch5 + ch5 + ch5 + ch6 + ch7 + ch5 + ch5 + ch7);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.");
        int number = 123;
        int hundreds = number / 100;
        int decades = number / 10;
        int units = number / 1;
        int sum1 = hundreds + decades + units;
        int sum2 = hundreds * decades * units;
        System.out.println("Число " + number + " содержит: ");
        System.out.println("Сотен: " + hundreds + ", десятков: " + decades + ", единиц: " + units + ".");
        System.out.println("Сумма цифр: " + sum1 + ", произведение: " + sum2);

        System.out.println("\n9. Вывод времени.");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int lastSeconds = seconds - hours * 3600 - minutes * 60;
        System.out.println(hours + ":" + minutes + ":" + lastSeconds);
    }
}