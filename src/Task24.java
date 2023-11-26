import java.util.Random;

public class Task24 {

    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        initFirstArray(arr);

        showMatrix(arr);

        powLineInMatrix(arr);

        showMatrix(arr);
    }

    public static void initFirstArray(int[][] mas) {
        Random random = new Random();

        for (int i = 0; i < mas[0].length; i++) {
            mas[0][i] = random.nextInt(6);
        }
    }

    public static void showMatrix(int[][] mas) {
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void powLineInMatrix(int[][] mas) {
        double n = 2;
        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) Math.pow(mas[0][j], n);
            }
            n++;
        }
    }
}