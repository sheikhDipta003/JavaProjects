public class ArrayDemo {
    public static void main(String[] args) {
        int[] myArray = new int[100];

        for(int i = 0 ; i < myArray.length ; i++){
            myArray[i] = i;
        }

        System.out.println("myArray['A'] = " + myArray['A']);
        //Since the ASCII value of 'A' is 65, it will show myArray[65], or 65 to the console.
        for(int i = 'A' ; i <= 'Z' ; i++){
            System.out.println(myArray[i]);
        }
    }
}
