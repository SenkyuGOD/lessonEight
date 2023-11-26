import java.util.Random;

public class Task31 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[4][4];

        initArray(arr);

        showArray(arr);

        howMuchTwoDigitNumInArray(arr);
    }
    public static int[][] initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(999);
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
    public static void howMuchTwoDigitNumInArray(int[][] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] / 100 == 0 && mas[i][j] / 10 != 0) {
                    count++;
                }
            }
        }
        System.out.println("кол-во двузначных чисел = " + count);
    }
}
