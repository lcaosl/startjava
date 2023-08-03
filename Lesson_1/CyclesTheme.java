public class CyclesTheme {
    public static void main(String[] args) {

        System.out.println("1. Подсчет суммы четных и нечетных чисел.");
        int count = -10;
        int evenNumbers = 0;
        int oddNumbers = 0;
        do {
            if (count % 2 == 0) {
                evenNumbers += count;
            } else {
                oddNumbers += count;
            }
            count++;
        } while (count <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenNumbers + ", а нечетных = "
                + oddNumbers + ".");

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        int minNum = 0;
        if (num1 > num2 && num1 > num3) {
            maxNum += num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum += num2;
        } else {
            maxNum += num3;
        }
        if (num1 < num2 && num1 < num3) {
            minNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }
        System.out.println("maxNum = " + maxNum + ", minNum = " + +minNum + ".");
        for (int i = maxNum; i >= minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр.");

        int number = 1234;
        int i = 0;
        int result = 0;
        while (number > 0) {
            i = number % 10;
            number = number / 10;
            result += i;
            System.out.print(i);
        }
        System.out.println("\nСумма цифр числа = " + result + ".");

        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");

        int k = 1;
        for (int j = 1; j < 32; j += 2, k++) {
            System.out.printf("%04d ", j);
            if (k % 5 == 0)
                System.out.println();
        }
        k--; // реальное количество выведенных чисел
        if (k % 5 != 0) {
            for (int j = k % 5; j < 5; j++) {
                System.out.printf("%04d ", 0);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность.");

        int numb = 324259222;
        int numb1 = numb;
        int resultNumb = 0;
        while (numb > 0) {
            i = numb % 10;
            numb = numb / 10;
            if (i == 2) {
                resultNumb += 1;
            }
        }
        if (resultNumb % 2 == 0) {
            System.out.println("В " + numb1 + " (четное) количество двоек - " + resultNumb + ".");
        } else {
            System.out.println("В " + numb1 + " (нечетное) количество двоек - " + resultNumb + ".");
        }

        System.out.println("\n6. Отображение геометрических фигур.");

        int length1 = 50;
        for (int p = 1; p <= length1; p++) {
            System.out.print("* ");
            if (p % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        int o, j;
        int size = 5;
        o = 1;
        while (o <= size) {
            j = 5;
            while (j >= o) {
                System.out.print("#");
                j--;
            }
            o++;
            System.out.println();
        }

        System.out.println();

        int h = 1;
        do {
            if (h == 1) {
                System.out.println("$");
            } else if (h > 1 && h < 4) {
                System.out.print("$");
            } else if (h == 4) {
                System.out.print("\n" + "$");
            } else if (h > 4 && h < 7) {
                System.out.print("$");
            } else if (h == 7) {
                System.out.print("\n" + "$");
            } else if (h > 7 && h < 9) {
                System.out.print("$");
            } else {
                System.out.println("\n" + "$");
            }
            h++;
        } while (h <= 9);

        System.out.println("\n7. Отображение ASCII-символов.");

        System.out.println("DECIMAL  CHARACTER");
        for (int y = 33; y < 256; y++) {
            char ch = (char) y;
            System.out.printf("  %03d %8s%n", y, ch);
        }
        System.out.println();

        System.out.println("\n8. Проверка, является ли число палиндромом.");

        int a;
        int res = 0;
        int n = 1234326;
        int b = n;

        while (n != 0) {
            a = n % 10;
            res = (res * 10) + a;
            n = n / 10;
        }
        if (b == res) {
            System.out.println("Число " + b + " является палиндромом.");
        } else {
            System.out.println("Число " + b + " не является палиндромом.");
        }
        System.out.println(b);
        System.out.println(res);
        System.out.println(n);

        System.out.println("\n9. Проверка, является ли число счастливым.");

        int num = 123060;
        int firstHalf = num / 1000;
        int secondHalf = num % 1000;
        int sum1 = 0;
        int sum2 = 0;
        int half;
        while (firstHalf != 0) {
            half = firstHalf % 10;
            firstHalf = firstHalf / 10;
            sum1 += half;
        }
        while (secondHalf != 0) {
            half = secondHalf % 10;
            secondHalf = secondHalf / 10;
            sum2 += half;
        }
        if (sum1 == sum2) {
            System.out.println("Число " + num + " является счастливым.");
        } else {
            System.out.println("Число " + num + " не является счастливым.");
        }

        System.out.println("\n10. Отображение таблицы умножения Пифагора.");

        for (int e = 1; e < 10; e++) {
            for (int t = 1; t < 10; t++) {
                System.out.printf("%3d |", e * t);
            }
            System.out.println();
            System.out.println("----------------------------------------------");
        }
    }
}