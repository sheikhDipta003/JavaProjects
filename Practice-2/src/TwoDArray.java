public class TwoDArray {
    public static void main(String[] args) {
        int[][] myArr = new int[4][];
        int count = 0;

        for(int i = 0 ; i < 4 ; i++){
            myArr[i] = new int[i+1];
        }

        for(int i = 0 ; i < myArr.length ; i++){
            for(int j = 0 ; j < myArr[i].length ; j++){
                myArr[i][j] = count++;
            }
        }

        for(int i = 0 ; i < myArr.length ; i++){
            for(int j = 0 ; j < myArr[i].length ; j++){
//                System.out.println("myArr[" + i + "][" + j + "] = " + myArr[i][j]);
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
