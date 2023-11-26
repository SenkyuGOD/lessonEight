import java.util.*;

public class Task09 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        initArray(arr);

        showArray(arr);

        showDioganalOfArray(arr);
    }

    public static int[][] initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(9);
            }
        }
        return a;
    }

    public static void showArray(int[][] mas) {
        System.out.println("Исходная матрица------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void showDioganalOfArray(int[][] mas) {
        System.out.println("Диоганали матрица------");
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("[%4d]", mas[i][i]);
            System.out.printf("[%4d]", mas[i][mas[i].length - 1 - i]);
            System.out.println();
        }
    }
}
