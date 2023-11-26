import java.util.Random;

public class Task38 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];

        initArray(arr1);
        initArray(arr2);

        showArray(arr1);
        showArray(arr2);

        sumOfArray(arr1, arr2);
    }

    public static int[][] initArray(int[][] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(15);
            }
        }
        return mas;
    }

    public static void showArray(int[][] mas) {
        System.out.println("Исходная матрица----------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void sumOfArray(int[][] mas1, int[][] mas2) {
        System.out.println("Сумма двух матриц------------");
        int[][] sum = new int[mas1.length][mas1[0].length];
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                sum[i][j] = mas1[i][j] + mas2[i][j];
                System.out.printf("[%4d]", sum[i][j]);
            }
            System.out.println();
        }
    }
}
