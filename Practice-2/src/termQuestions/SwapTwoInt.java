package termQuestions;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoInt {
    public static void main(String[] args) {
        int x = 10, y = 5;
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        swap(list);
        x = list.get(0);
        y = list.get(1);
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void swap(List<Integer> f_list){
        int x0, x1;
        x0 = f_list.get(0);
        x1 = f_list.get(1);
        f_list.set(0, x1);
        f_list.set(1, x0);
    }
}
