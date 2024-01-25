import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        int evenNumSum = 0;
        int evenNumCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте! Для расчета среднего арифметического числа введите число начала диапазона: ");
        int firstNum = scanner.nextInt();
        int i = firstNum;
        if (firstNum >= 0) {
            System.out.println("Число успешно введено");
        }

        System.out.print("Введите второе число конца диапазона: ");
        int secondNum = scanner.nextInt();
        if (secondNum >= 0) {
            System.out.println("Успешно !");
        }

        while (i <= secondNum) {
            sum = sum + i;

            if (i % 2 == 0) {
                evenNumSum += i;
                evenNumCount++;
            }

            i++;
            count++;
        }

        double summaryNumAverage = (double) sum / count;
        double evenNumAverage = (double) evenNumSum / evenNumCount;

        System.out.println("Среднее арифметическое число = " + summaryNumAverage);
        System.out.println("Среднее арифметическое четных чисел = " + evenNumAverage);
    }
}

