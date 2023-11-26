import java.util.*;

public class Task07 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        initArray(arr);

        showArray(arr);

        sumOfNegativeElementsInArray(arr);
    }

    public static int[][] initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = -rand.nextInt(100);
            }
        }
        return a;
    }

    public static void showArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }

    }

    public static void sumOfNegativeElementsInArray(int[][] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] <= 0 && i % 2 != 0 && j % 2 != 0) {
                    sum += Math.abs( mas[i][j]);
                }
            }

        }
        System.out.println("сумма модулей отрицательных нечетных элементов: " + sum);
    }
}
