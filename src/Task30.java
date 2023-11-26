import java.util.*;

public class Task30 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];

        initArray(arr);

        System.out.println("Исходная матрица:");
        showArray(arr);

        checkHowMuchFiveInArray(arr);
    }

    public static int[][] initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(15);
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

    public static void checkHowMuchFiveInArray(int[][] mas) {
        System.out.print("номера строк, в которых число 5 встречается три и более раз: ");
        for (int i = 0; i < mas.length; i++) {
            int count = 0;
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == 5) {
                    count++;
                }

            }
            if (count >= 3) {
                System.out.print(i +" ");
            }
        }

    }
}
