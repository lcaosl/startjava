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
        int num = 0;
        if (num != 0) {
            if (num % 2 == 0 && num > 0) {
                System.out.println("Число " + num + " четное и положительное.");
            } else if (num % 2 == 0 && num < 0) {
                System.out.println("Число " + num + " четное и отрицательное.");
            }

            if (num % 2 != 0 && num > 0) {
                System.out.println("Число " + num + "нечетное и положительное.");
            } else if (num % 2 != 0 && num < 0) {
                System.out.println("Число " + num + " нечетное и отрицательное.");
            }
        }
        System.out.print("Исходное число: " + num + ".");

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        int num3 = 777;
        int num4 = 122;
        int hundreds = num3 / 100;
        int tens = num3 / 10 % 10;
        int ones = num3 % 10;
        int hundreds1 = num4 / 100;
        int tens1 = num4 / 10 % 10;
        int ones1 = num4 % 10;
        System.out.println("Исходные числа: " + num3 + " и " + num4);

        if (hundreds != hundreds1 && tens != tens1 && ones != ones1) {
            System.out.println("В цифрах одинаковых чисел нет.");
        } else if (hundreds == hundreds1) {
            System.out.println("Одинаковые числа: " + hundreds + " из разряда сотен.");

            if (tens == tens1) {
                System.out.println("Одинаковые числа: " + tens + " из разряда десятков.");
            }
            if (ones == ones1) {
                System.out.println("Одинаковые числа: " + ones + " из разряда единиц.");
            }
        }

        System.out.println("\n5. Определение символа по его коду.");
        char code = '\u0057';
        if (code >= 'A' && code <= 'Z' || code >= 'a' && code <= 'z') {
            System.out.println("Это буква " + code + ".");
        } else if (code >= '0' && code <= '9') {
            System.out.println("Это число " + code + ".");
        } else {
            System.out.println("Это не буква и не число. Это символ " + code + ".");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %.");
        double deposit = 300000;
        double finalSum = deposit + deposit * 0.05;

        if (deposit >= 100000 && deposit <= 300000) {
            finalSum = deposit + deposit * 0.07;
        } else if (deposit > 300000) {
            finalSum = deposit + deposit * 0.1;
        }
        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Начисленный за год процент: " + (finalSum - deposit) + " руб.");
        System.out.println("Итоговая сумма: " + finalSum + " руб.");

        System.out.println("\n7. Определение оценки по предметам.");
        double historyPercent = 59;
        double historyGrade = 2;
        if (historyPercent > 60 & historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 & historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        System.out.println(historyGrade + " - История");

        double programmingPercent = 91;
        double programmingGrade = 2;
        if (programmingPercent > 60 & programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 & programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println(programmingGrade + " - Программирование");
        System.out.println("Средний балл оценок по предметам = " + (historyGrade + programmingGrade) / 2 + ".");
        System.out.println("Средний % по предметам = " + (historyPercent + programmingPercent) / 2 + " %.");

        System.out.println("\n8. Расчет прибыли за год.");
        int rent = 5000;
        int saleGoodsMonth = 13000;
        int costGoods = 9000;
        int profit = (saleGoodsMonth - costGoods - rent) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit + " рублей.");
        } else {
            System.out.println("Прибыль за год: " + profit + " рублей.");
        }

        System.out.println("\n9. Подсчет количества банкнот.");
        int sum = 567;
        int quantityBill100 = 10;
        int quantityBill10 = 5;
        int quantityBill1 = 50;
        int quantityHundredsInSum = sum / 100;
        int quantityTensInSum = sum / 10 % 10;
        int quantityOnesInSum = sum % 10;
        int maxSumToIssued = quantityBill100 * 100 + quantityBill10 * 10 + quantityBill1;
        int cash = 0;
        int issuedBill100 = 0;
        int issuedBill10 = 0;
        int issuedBill1 = 0;
        if (sum > maxSumToIssued | sum % 100 > quantityBill10 * 10 + quantityBill1 | sum % 10 > quantityOnesInSum) {
            System.out.println("Не достаточно купюр для проведения операции.");

        } else if (sum >= quantityHundredsInSum * 100) {
            if (quantityBill100 >= quantityHundredsInSum) {
                cash = quantityHundredsInSum * (quantityBill100 * 100 / 10);
                issuedBill100 = quantityHundredsInSum;
            } else if (quantityBill100 < quantityHundredsInSum) {
                cash = quantityBill100 * 100 + (quantityHundredsInSum - quantityBill100) *
                        (quantityBill10 / quantityBill10) * 100;
                issuedBill100 += quantityBill100;
                issuedBill10 += (quantityHundredsInSum - quantityBill100);
            }

            if (cash < sum) {
                if (quantityBill10 <= quantityTensInSum) {
                    cash += quantityBill10 * 10;
                    issuedBill10 += quantityBill10;
                } else {
                    cash += quantityTensInSum * 10;
                    issuedBill10 += quantityTensInSum;
                }
            }

            if (sum > cash) {
                if (quantityBill1 >= sum - cash) {
                    issuedBill1 += sum - cash;
                    cash += (sum - cash);
                }
            }
            System.out.println("Чтобы снять " + cash + " долларов, потребуется банкнот: " + issuedBill100 +
                    " номиналом 100$, " + issuedBill10 + " номиналом 10$, и " + issuedBill1 + " банкнот номиналом 1$.");
        }
    }
}