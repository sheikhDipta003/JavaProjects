package termQuestions;

import java.io.*;

class TestClass{
    String s;
    double d;
    TestClass(String s, double d){
        this.s = s;
        this.d = d;
    }
    @Override
    public String toString(){
        return (s + "," + d + "\n");
    }
}

public class ReadWriteObjInFile {
    public static void main(String[] args) throws IOException {
        TestClass obj1 = new TestClass("Mr. A", 18.5);
        Writer w = new FileWriter("test.txt");
        BufferedWriter bw = new BufferedWriter(w);
        bw.write(obj1.toString());
        TestClass obj2;
        Reader r = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(r);
        String dataReadFromFile = br.readLine();
        //obj2 = new TestClass(dataReadFromFile.split(",")[0], Double.parseDouble(dataReadFromFile.split(",")[1]));
        System.out.println(obj1);
        //System.out.println(obj2);
        w.close();
        r.close();
        br.close();
        bw.close();
    }
}
