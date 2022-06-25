package termQuestions;

import java.util.HashMap;
import java.util.Objects;

public class HashMapDemo_CompareInstitutes{
    private int eiin;
    private int shift;
    private int version;
    private int group;

    public HashMapDemo_CompareInstitutes(int eiin, int shift, int version, int group){
        this.eiin=eiin; this.shift=shift; this.version = version; this.group = group;
    }

    public static void main(String[] args) {
        HashMapDemo_CompareInstitutes I1 = new HashMapDemo_CompareInstitutes(135790, 1, 1, 0);
        HashMapDemo_CompareInstitutes I2 = new HashMapDemo_CompareInstitutes(135790, 1, 1, 0);

        System.out.println(I1.equals(I2));

        HashMap<HashMapDemo_CompareInstitutes, Integer> map = new HashMap<>();
        map.put(I1, 100);
        System.out.println(map.get(I2));
    }

    @Override
    public boolean equals(Object ob){
        if(this == ob)  return true;
        if(!(ob instanceof HashMapDemo_CompareInstitutes))  return false;

        HashMapDemo_CompareInstitutes ob1 = (HashMapDemo_CompareInstitutes) ob;
        if(this.eiin == ob1.eiin && this.shift == ob1.shift && this.version == ob1.version && this.group == ob1.group){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.eiin);
    }
}
