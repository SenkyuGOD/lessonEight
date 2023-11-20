import java.util.Random;
import java.util.Arrays;

public class Task33 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        initArray(arr);

        showArray(arr);

        sortArraysColumnUp(arr);

        System.out.println();
        System.out.println("Отсортированные столбцы в массиве по возрастанию--------");

        showArray(arr);

        sortArraysColumnDown(arr);

        System.out.println();
        System.out.println("Отсортированные столбцы в массиве по убыванию--------");

        showArray(arr);
    }

    public static int[][] initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(10);
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

    public static int[][] sortArraysColumnUp(int[][] mas) {
        int[] arr = new int[mas.length];
        for (int i = 0; i < mas[0].length; i++) {
            for (int j = 0; j < mas.length; j++) {
                arr[j] = mas[j][i];
            }

            Arrays.sort(arr);

            for (int j = 0; j < mas.length; j++) {
                mas[j][i] = arr[j];
            }
        }
        return mas;
    }
    public static int[][] sortArraysColumnDown(int[][] mas) {
        int[] arr = new int[mas.length];
        for (int i = 0; i < mas[0].length; i++) {
            for (int j = 0; j < mas.length; j++) {
                arr[j] = mas[j][i];
            }

            Arrays.sort(arr);

            for (int j = 0; j < mas.length; j++) {
                mas[j][i] = arr[mas.length - 1 - j];
            }
        }
        return mas;
    }
}
