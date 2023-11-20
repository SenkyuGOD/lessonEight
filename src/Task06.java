import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[4][4];

        initArray(arr);

        showArray(arr);

        showOddColumnArray(arr);
    }

    public static int[][] initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(300);
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

    public static void showOddColumnArray(int[][] mas) {
        System.out.println();
        System.out.println("Нечетные столбцы ------");

        for (int j = 0; j < mas[0].length; j++) {
            if (j % 2 != 0 && mas[0][j] > mas[mas.length - 1][j]) {
                for (int k = 0; k < mas.length; k++) {
                    System.out.printf("[%4d]\n", mas[k][j]);
                }
                System.out.println();
            }
        }
    }
}