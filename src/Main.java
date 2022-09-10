public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;

        }
        return arr;

    }

    public static void main(String[] args) {

        // задание 1
        int salaries[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];

        }
        System.out.println(" Сумма трат за месяц составила" + sum + " рублей");

        // задание 2

        int expense[] = generateRandomArray();
        int min = expense[0];
        int max = expense[0];
        for (int Salaries : expense) ;
        {
            if (max < expense[0]) {
                max = expense[0];
            }

            if (min > expense[0]) ;
            {
                min = expense[0];
            }
        }
        System.out.println(" максимальная сумма трат за день составила" + max + " минимальная сумма трат за день составила " + min);

        // задание 3
        public static void task3() {
            int salaries1[] = generateRandomArray();
            int sum1 = 0;
            for (var Salaries : salaries1) ;
            {
                sum1 += salaries1;

            }
            var result = (double) sum / salaries1.length;
            System.out.println(" средняя сумма трат составила" + sum1 + " рублей");

        }

        // задание 4
        char [] reverseFullName = { 'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        for (int i = reverseFullName.length - 1; i >= 0; i --) {
            System.out.print(reverseFullName [i] );
        }


    }
}



