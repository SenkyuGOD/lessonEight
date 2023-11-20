import java.util.Arrays;
import java.util.Random;

public class Task32 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        initArray(arr);

        System.out.println("Исходная матрица:");
        showArray(arr);

        sortArraysLineUp(arr);

        System.out.println("\nОтсортированные строки в массиве по возрастанию:");
        showArray(arr);

        sortArraysLineDown(arr);

        System.out.println("\nОтсортированные строки в массиве по убыванию:");
        showArray(arr);
    }

    public static void initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(10);
            }
        }
    }

    public static void showArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void sortArraysLineUp(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            int[] arr = mas[i].clone();
            Arrays.sort(arr);
            mas[i] = arr.clone();
        }
    }

    public static void sortArraysLineDown(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            int[] arr = mas[i].clone();
            Arrays.sort(arr);
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[j];
                arr[j] = arr[arr.length - 1 - j];
                arr[arr.length - 1 - j] = temp;
            }
            mas[i] = arr.clone();
        }
    }
}
