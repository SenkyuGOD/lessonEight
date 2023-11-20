import java.util.Random;
public class Task05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[rand.nextInt(5)][rand.nextInt(5)];

        initArray(arr);

        showArray(arr);

        showMultiplesLineArray(arr);
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

    public static void showMultiplesLineArray(int[][] mas) {
        System.out.println();
        System.out.println("Кратные сторки--------");
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.printf("[%4d]", mas[i][j]);
                }
                System.out.println();
            }
        }
    }
}
