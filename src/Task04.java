import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[rand.nextInt(5)][rand.nextInt(5)];

        initArray(arr);

        showArray(arr);

        showFirstLineArray(arr);
        showLastLineArray(arr);
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

    public static void showFirstLineArray(int[][] mas) {
        System.out.println();
        System.out.println("Первый строка ------");
        for (int i = 0; i < mas[0].length; i++) {
            System.out.printf("[%4d]", mas[0][i]);
        }
    }

    public static void showLastLineArray(int[][] mas) {
        System.out.println();
        System.out.println("Последняя строка ------");
        for (int i = 0; i < mas[mas.length - 1].length; i++) {
            System.out.printf("[%4d]", mas[mas.length - 1][i]);
        }
    }
}
