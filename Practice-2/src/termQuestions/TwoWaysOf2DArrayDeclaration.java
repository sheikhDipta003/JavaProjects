package termQuestions;

public class TwoWaysOf2DArrayDeclaration {
    public static void main(String[] args) {

        //way - 1
        int[][] arr = new int[4][];
        int value = 0;
        for(int i = 0 ; i < 4 ; i++){
            arr[i] = new int[i+1];
            for(int j = 0 ; j <= i ; j++){
                arr[i][j] = value++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //way - 2
        System.out.println("==============================");
        int[][] arr2 = {{0},
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}};
        for(int[] x : arr2){
            for(int v : x){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
