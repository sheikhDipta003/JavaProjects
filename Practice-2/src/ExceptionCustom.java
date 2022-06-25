class MyException extends Exception{
    private int var;
    MyException(int var){
        this.var = var;
    }

    @Override
    public String toString(){
        return ("My Exception: " + var);
    }
}

public class ExceptionCustom {
    public static void compute(int i) throws MyException {
        if(i > 10){
            throw new MyException(i);
        } else{
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        try{
            compute(10);
            compute(20);
        } catch (MyException e){
            System.out.println(e);
        }
    }
}
