import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        initArray(arr);

        showArray(arr);

        reverseArrayByLine(arr);

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

    public static int[][] reverseArrayByLine(int[][] mas) {
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            int[] arr = mas[i].clone();
            if(i % 2 == 0) {
                for (int j = 0; j < arr.length / 2; j++) {
                    int temp = arr[j];
                    arr[j] = arr[arr.length - 1 - j];
                    arr[arr.length - 1 - j] = temp;
                }
                mas[i] = arr.clone();
            }
        }
        return mas;
    }
}
