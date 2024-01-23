public class Average {
    public static void main(String[] args) {

        int i = 5;
        int secondNum = 9;
        int count = 0;
        double sum = 0;
        int evenNumSum = 0;
        int evenNumCount = 0;

        while (i <= secondNum) {
            sum = sum + i;

            if (i % 2 == 0) {
                evenNumSum +=i;
                evenNumCount++;
            }

            i++;
            count++;
        }

        sum = sum / count;
        double evenNumAverege = (double) evenNumSum / evenNumCount;

        System.out.println("Среднее арифметическое число = " + sum);
        System.out.println("Среднее арифметическое четных чисел = " + evenNumAverege);
    }
}

