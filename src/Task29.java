import java.util.Random;

public class Task29 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        initArray(arr);

        showArray(arr);

        showPositiveElementsInDiagonal(arr);

    }
    public static void initArray(int[][] mas){
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void showArray(int[][] mas) {
        System.out.println("Исходная матрица--------------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]",mas[i][j]);
            }
            System.out.println();
        }
    }
    public static void showPositiveElementsInDiagonal(int[][] mas){
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i][i] > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных элементов на главной диагонали: " + count);
    }
}
