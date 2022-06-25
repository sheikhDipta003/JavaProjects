package offline_4;

import practice_1.Club;
import java.util.Arrays;
import java.util.Comparator;

public class League {
    private Match[] matches;
    private int matchCount;
    private int clubCount;
    // add your variables here, if required
    private String name;
    private Club[] clubs;
    private Club[] clubs2;

    public League() {
        // assume a league can have at most 5 clubs, add code for initialization accordingly
        clubCount = 0;
        matchCount = 0;
        clubs = new Club[5];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printLeagueInfo(){
        System.out.println("League : " + name);
        printClubs();
    }

    public void printClubs(){
        System.out.println("Clubs:");
        // print the name of the clubs of this league, each one on a line
        for(int i = 0 ; i < clubCount ; i++){
            System.out.println(clubs[i].getName());
        }
    }

    public void scheduleMatches(){
        matchCount = (clubCount*(clubCount-1));
        matches = new Match[matchCount];
        int matchNo = 0;
        for (int i=0; i<clubCount; i++){
            for (int j=0; j<clubCount; j++){
                // check the constructor of the Match class and add your code here
                // note that there will be two matches between club A and club B
                // in the first match, club A will play as the home team and in the second match, as the away team

                if(i != j){
                    matches[matchNo] = new Match(matchNo, clubs[i], clubs[j]);
                    matchNo++;
                }
            }
        }
    }

    public void simulateMatches(){
        for (int i=0; i<matchCount; i++){
            matches[i].play();
        }
    }

    public void showStandings(){
        // sort the clubs in descending order of points
        // note that, the sequence in which clubs were added to the league, should be unchanged
        // check the given sample output for clarification
        // (carefully observe the output of showStandings() followed by printLeagueInfo() method calls
        // you can use additional arrays if needed
        System.out.println("Sl. - practice_1.Club - Points");
        // print the clubs in descending order of points
        clubs2 = new Club[clubCount];
        for(int i = 0 ; i < clubCount ; i++){
            clubs2[i] = new Club();
            clubs2[i] = clubs[i];
        }

        Arrays.sort(clubs2, new Comparator<Club>() {
            @Override
            public int compare(Club o1, Club o2) {
                return o2.getScore() - o1.getScore();
            }
        });

        for(int i = 0 ; i < clubCount ; i++){
            System.out.println((i + 1) + ". " + clubs2[i].getName() + " " + clubs2[i].getScore());
        }
    }

    // add your methods here, if required
    public void addClub(Club club){
        clubs[clubCount++] = club;
    }

    public void printMatches(){
        System.out.println("Matches:");
        for(int i = 0 ; i < matchCount ; i++){
            matches[i].showResult();
        }
    }

    public void removeClub(Club club){
        for(int i = 0 ; i < clubCount ; i++){
            if(clubs[i] == club){
                for (int j = i ; j < (clubCount - 1) ; j++){
                    clubs[j] = clubs[j+1];
                }
                clubCount--;
                break;
            }
        }
    }
}

