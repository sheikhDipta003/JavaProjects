package practice_1;

public class Club {
    private int id;
    private String name;
    private Player[] players;
    // add your code here
    private int playerCount = 0;
    private int score;

	// you are not allowed to write any other constructor
    public Club() {
        this.players = new Player[11];
    }

	public double getSalary() {
        double total = 0;
        for (int i = 0; i < playerCount; i++) {
            total += players[i].getSalary();
        }
        return total;
    }
	
	// add your code here

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId(){
        return  id;
    }

    public String getName(){
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addPlayer(Player player) {
        players[playerCount++] = player;
    }

    public Player getMaxSalaryPlayer(){
        Player maxSalaryPlayer = players[0];

        for(int i = 0 ; i < playerCount ; i++){
            if(players[i].getSalary() > maxSalaryPlayer.getSalary()){
                maxSalaryPlayer = players[i];
            }
        }

        return maxSalaryPlayer;
    }
}