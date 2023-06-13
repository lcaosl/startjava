public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java.");
        int age = 30;
        if (age > 20) {
            System.out.println("Тебе пора в армию.");
        } else {
            System.out.println("Сиди дома.");
        }

        boolean male = false;
        if (!male) {
            System.out.println("Ты красавчик.");
        } else {
            System.out.println("Ты красавица.");
        }

        double height = 1.797;
        if (height < 1.80) {
            System.out.println("Подрасти ещё.");
        } else {
            System.out.println("Ты достаточно высок.");
        }

        char firstLetterOfName = "Masha".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Твое имя начинается на \"M\".");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Твое имя начинается на \"I\".");
        } else {
            System.out.println("В нашем алфавите всего две буквы.");
        }

        System.out.println("\n2. Поиск max и min числа.");
        int num1 = 256;
        double num2 = 256.35;
        if (num1 == num2) {
            System.out.println("Числа равны.");
        } else if (num1 > num2) {
            System.out.println("Максимальное число: " + num1 + ", минимальное: " + num2 + ".");
        } else {
            System.out.println("Максимальное число: " + num2 + ", минимальное: " + num1 + ".");
        }

        System.out.println("\n3. Проверка числа.");
        int num = 8;
        if (num == 0) {
            System.out.print("");
        } else if (num % 2 == 0) {
            System.out.println("Число " + num + " четное.");
        } else if (num % 2 != 0) {
            System.out.println("Число " + num + " нечетное.");
        }
        if (num > 0) {
            System.out.println("Число " + num + " положительное.");
        } else if (num < 0) {
            System.out.println("Число " + num + " отрицательное.");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        int num3 = 753;
        int num4 = 951;
        int hundreds = num3 / 100;
        int tens = num3 / 10 % 10;
        int ones = num3 % 10;
        System.out.println("Исходные числа: " + num3 + " и " + num4);

        if (hundreds == num4 / 100) {
            System.out.println("Одинаковые числа: " + hundreds + " из разряда сотен.");
        }
        if (tens == num4 / 10 % 10) {
            System.out.println("Одинаковые числа: " + tens + " из разряда десятков.");

        }
        if (ones == num4 % 10) {
            System.out.println("Одинаковые числа: " + ones + " из разряда единиц.");
        }
        if (hundreds != num4 / 100 & tens != num4 / 10 % 10 & ones != num4 % 10) {
            System.out.println("В цифрах одинаковых чисел нет.");
        }

        System.out.println("\n5. Определение символа по его коду.");
        char code = '\u0057';
        if (code >= 'A' & code <= 'Z' || code >= 'a' & code <= 'z') {
            System.out.println("Это буква " + code + ".");
        } else if (code >= '0' & code <= '9') {
            System.out.println("Это число " + code + ".");
        } else {
            System.out.println("Это не буква и не число. Это символ " + code + ".");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %.");
        double deposit = 300000;
        double finalSum = 0;

        if (deposit < 100000) {
            finalSum = deposit + deposit / 20;
        }
        if (deposit >= 100000 & deposit <= 300000) {
            finalSum = deposit + (deposit * 0.07);
        }
        if (deposit > 300000) {
            finalSum = deposit + (deposit / 10);
        }
        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Начисленный за год процент: " + (finalSum - deposit) + " руб.");
        System.out.println("Итоговая сумма: " + finalSum + " руб.");

        System.out.println("\n7. Определение оценки по предметам.");
        double historyAssessment = 59;
        double programAssessment = 91;
        double programAverage = 0;
        double historyAverage = 0;
        if (historyAssessment <= 60) {
            historyAverage += 2;
            System.out.println("2 - История");
        }
        if (historyAssessment > 60 & historyAssessment <= 73) {
            historyAverage += 3;
            System.out.println("3 - История");
        }
        if (historyAssessment > 73 & historyAssessment <= 91) {
            historyAverage += 4;
            System.out.println("4 - История");
        }
        if (historyAssessment > 91) {
            historyAverage += 5;
            System.out.println("5 - История");
        }
        if (programAssessment <= 60) {
            programAverage += 2;
            System.out.println("2 - Программирование");
        }
        if (programAssessment > 60 & programAssessment <= 73) {
            programAverage += 3;
            System.out.println("3 - Программирование");
        }
        if (programAssessment > 73 & programAssessment <= 91) {
            programAverage += 4;
            System.out.println("4 - Программирование");
        }
        if (programAssessment > 91) {
            programAverage += 5;
            System.out.println("5 - Программирование");
        }
        System.out.println("Средний балл оценок по предметам = " + (historyAverage + programAverage) / 2 + ".");
        System.out.println("средний % по предметам = " + (historyAssessment + programAssessment) / 2 + " %.");

        System.out.println("\n8. Расчет прибыли за год.");
        int rent = 5000;
        int saleGoodsMonth = 13000;
        int costGoods = 9000;
        int year = 12;
        int rentYear = rent * year;
        int saleGoodsYear = saleGoodsMonth * year;
        int costGoodYear = costGoods * year;
        int profit = saleGoodsYear - costGoodYear - rentYear;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit + " рублей.");
        } else if (profit < 0) {
            System.out.println("Прибыль за год: " + profit + " рублей.");
        } else {
            System.out.println("Прибыль за год: 0 рублей.");
        }

        System.out.println("\n9. Подсчет количества банкнот.");
        int sum = 567;
        int bill100 = 10;
        int bill10 = 5;
        int bill1 = 50;
        int hundred = sum / 100;
        int ten = sum / 10 % 10;
        int one = sum % 10;
        int cash = 0;
        int outBill100 = 0;
        int outBill10 = 0;
        int outBill1 = 0;
        if (sum >= hundred * 100) {
            if (bill100 >= hundred) {
                cash = hundred * (bill100 * 100 / 10);
                outBill100 = hundred;
            } else if (bill100 < hundred) {
                cash = bill100 * 100 + (hundred - bill100) * (bill10 / bill10) * 100;
                outBill100 += bill100;
                outBill10 += (hundred - bill100);
            }

        }

        if (cash < sum) {
            if (bill10 <= ten) {
                cash += bill10 * 10;
                outBill10 += bill10;
            } else {
                cash += ten * 10;
                outBill10 += ten;
            }

        }

        if (sum > cash) {
            if (bill1 >= sum - cash) {
                outBill1 += sum - cash;
                cash += (sum - cash);

            } else if (one > bill1) {
                System.out.println("Не достаточно купюр для проведения операции.");
            }

            System.out.println("Чтобы снять " + cash + " долларов, потребуется банкнот: " + outBill100 + " номиналом 100$, " +
                    outBill10 + " номиналом 10$, и " + outBill1 + " банкнот номиналом 1$.");
        }
    }
}