package termQuestions;

public class MinMax {
    public static void main(String[] args) {
        int a = minMax("min", 2, 1, 6, 4, 5);
        int b = minMax("min", 3, 0, 6);
        int c = minMax("max", 1, 2, 6, 5);
        int d = minMax("max", 1, 3, 7);

        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }

    public static int minMax(String minOrMax, int ... v){
        int t = v[0];

        if(minOrMax.equals("min")){
            for(int i = 1 ; i < v.length ; i++){
                if(v[i] < t){
                    t = v[i];
                }
            }
        } else if(minOrMax.equals("max")){
            for(int i = 1 ; i < v.length ; i++){
                if(v[i] > t){
                    t = v[i];
                }
            }
        }

        return t;
    }
}
