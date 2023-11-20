import java.util.*;

public class Task35 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        initArray(arr);

        System.out.println("Исходная матрица:");
        showArray(arr);

        int max;

        max = findMaxValueInArray(arr);

        changeElementsInArray(arr,max);

        System.out.println("Изменённая матрица:");
        showArray(arr);
    }

    public static int[][] initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(100);
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

    public static int findMaxValueInArray(int[][] mas) {
        int max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (max < mas[i][j]) {
                    max = mas[i][j];
                }
            }
        }
        return max;
    }

    public static void changeElementsInArray(int[][] mas, int max) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    mas[i][j] = max;
                }
            }
        }
    }
}
