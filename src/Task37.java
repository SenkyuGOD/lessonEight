import java.util.Random;

public class Task37 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        Task04.initArray(arr);
        Task04.showArray(arr);

        swapLineInMatrix(arr);
        Task04.showArray(arr);

    }

    public static int randomLine() {
        Random random = new Random();
        return random.nextInt(6);
    }


    public static int[][] swapLineInMatrix(int[][] mas) {
        int[][] arr = mas.clone();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = arr[randomLine()];
        }
        System.out.println();
        return mas;
    }
}
