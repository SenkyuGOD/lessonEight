public class Task22 {

    public static void main(String[] args) {

        int mas[][] = new int[6][6];

        for(int i = 0; i < mas.length; i++){
            int element = 1;
            for(int j = 0; j < mas[i].length; j++){
                if(j == mas[i].length - i){
                    break;
                }
                mas[i][j] = element;
                element++;
            }
        }


        for(int[] masi : mas) {
            for(int elem : masi) {
                System.out.printf("%3d ", elem);
            }
            System.out.println();
        }


    }



}