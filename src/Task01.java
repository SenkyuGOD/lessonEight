public class Task01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        arr[0][0] = 1;
        arr[1][1] = 1;
        arr[2][2] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("[%4d]", arr[i][j]);
            }
            System.out.println();
        }
    }

}