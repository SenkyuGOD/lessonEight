import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[rand.nextInt(5)][rand.nextInt(5)];

        initArray(arr);

        showArray(arr);

        showFirstColumnArray(arr);

        showLastColumnArray(arr);
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
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }

    }

    public static void showFirstColumnArray(int[][] mas) {
        System.out.println();
        System.out.println("Первый столбец ------");
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("[%4d]\n", mas[i][0]);
        }
    }

    public static void showLastColumnArray(int[][] mas) {
        System.out.println();
        System.out.println("Последний столбец ------");
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("[%4d]\n", mas[i][mas[i].length - 1]);
        }
    }
}
