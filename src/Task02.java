import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[][] mas = new int[2][3];

        initArray(mas);

        showArray(mas);
    }

    public static int[][] initArray(int[][] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(9);
            }
        }
        return mas;
    }

    public static void showArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }
}
