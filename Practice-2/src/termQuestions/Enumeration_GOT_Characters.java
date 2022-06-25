package termQuestions;

//Jon Snow Alive 7
//Daenerys Targaryen Alive 7
//Ned Stark Dead 1
//Joffrey Baratheon Dead 4
//Tyrion Lannister Alive 7

enum GOT{
    JS("Jon Snow", "Alive", 7), DT("Daenerys Targaryen", "Alive", 7), NS("Ned Stark", "Dead", 1), JB("Joffrey Baratheon", "Dead", 4), TL("Tyrion Lannister", "Alive", 7);
    private final String name;
    private final String status;
    private final int noOfSeasons;

    GOT(String name, String status, int noOfSeasons){
        this.name = name;
        this.status = status;
        this.noOfSeasons = noOfSeasons;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getNoOfSeasons() {
        return noOfSeasons;
    }

    public int size(){return 5;}
}

public class Enumeration_GOT_Characters {
    public static void main(String[] args) {
        //find the character which was active for the least number of seasons
        int minNoOfSeasons = GOT.JS.getNoOfSeasons();
        String name = "";

        for(GOT a : GOT.values()){
            if(minNoOfSeasons > a.getNoOfSeasons()){
                minNoOfSeasons = a.getNoOfSeasons();
                name = a.getName();
            }
        }
        System.out.println(name);
    }
}
