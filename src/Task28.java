import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];

        initArray(arr);

        showArray(arr);

        findMaxSumInColumn(arr);
    }

    public static int[][] initArray(int[][] mas) {
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(20);
            }
        }
        return mas;
    }

    public static void showArray(int[][] mas) {
        System.out.println("Исходный массив----------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]",mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void findMaxSumInColumn(int[][] mas) {
        int temp = 0;
        int columnLength = mas.length;
        int column = 0;

        for (int i = 0; i < columnLength; i++) {
            int sum = 0;
            for (int j = 0; j < mas.length; j++) {
                sum += mas[j][i];
            }
            if (temp < sum) {
                temp = sum;
                column = i;
            }
        }
        System.out.println("Столбец под номером " + column + " содержит максимальную сумму = " + temp);
    }
}
