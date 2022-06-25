package udemy_threading.ioUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PatternFinder {
    public List<Integer> find(File file, String pattern){
        List<Integer> lineNumbers = new ArrayList();
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            do {
                String line = br.readLine();
                if(line == null)    break;
                count++;
                if(line.contains(pattern)){
                    lineNumbers.add(count);
                }
            }while(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineNumbers;
    }
}
