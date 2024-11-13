import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("Задача 1");

       /* int [] numbers = new int [] {1,2,3};
        double [] decimals = {1.57, 7.654, 9.986};
        String [] employeeNames = {"Anna", "Kate", "Masha"};
        int [] employeeAges = {19, 23, 26};
        double [] employeeSalaries = new double[2];
        employeeSalaries[0] = 1500.0;
        employeeSalaries[1] = 2250.5;
        employeeSalaries[2]= 3123.55;*/

        {
//Задача 2
            System.out.println("Задача 2");
            int[] arr1 = new int[]{1, 2, 3};
            double[] arr2 = new double[]{1.57, 7.654, 9.986};
            String[] arr3 = new String[]{"Anna", "Kate", "Masha"};
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]);
                if (i != arr1.length - 1) {
                    System.out.print(", ");
                }
                System.out.println();
            }
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i]);
                if (i != arr2.length - 1) {
                    System.out.print(", ");
                }
                System.out.println();
                for (int I = 0; i < arr3.length; i++) {
                    System.out.print(arr3[i]);
                    if (i != arr3.length - 1) {
                        System.out.print(", ");
                    }
                    System.out.println();
                }
            }
//Задача 3
            System.out.println("Задача 3");
            System.out.print("arr1 в обратном порядке: ");
            for (int i = arr1.length - 1; i >= 0; i--) {
                System.out.print(arr1[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.println();
            }
            System.out.print("arr2 в обратном порядке: ");
            for (int i = arr2.length - 1; i >= 0; i--) {
                System.out.print(arr2[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.println();
            }
            System.out.print("arr3 в обратном порядке: ");
            for (int i = arr3.length - 1; i >= 0; i--) {
                System.out.print(arr3[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.println();
            }
            //Задача 4
            System.out.println("Задача 4");
            int[] arr = {1, 2, 3, 4, 5, 6};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i]++;
                }
                System.out.printf(Arrays.toString(arr));
            }
        }
//Урок 2. Задача 1.
System.out.println("Урок 2. Задача 1.");
        int[] expenses = new int[] {1, 2, 3, 4, 5};
        int totalExpenses = 0;

        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");

//Задача 2.
System.out.println("Задача 2.");
        int minExpense = expenses[0];
        int maxExpense = expenses[0];

        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
            if (expenses[i] < minExpense){
                minExpense = expenses[i];
                }
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
            System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");
        }

//Задача 3.
System.out.println("Задача 3.");
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        double average = (double) sum / expenses.length;
        System.out.println("Средняя сумма трат за день составила " + average + " рублей.");

//Задача 4.
System.out.println("Задача 4.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
    }
}