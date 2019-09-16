public class Player {

    private String name;
    private double height;
    private boolean athletic;
    private int gamesPlayed;
    private int totalPoints;
    private int totalRebounds;

    public Player(String theName, double theHeight, boolean isAthletic, int numGames, int numPoints, int numRebounds){
        name = theName;
        height =theHeight;
        athletic = isAthletic;
        gamesPlayed = numGames;
        totalPoints = numPoints;
        totalRebounds = numRebounds;
    }

    public double PPG(){
        double ppg = (double)totalPoints/gamesPlayed;
        return ppg;
    }

    public double RPG(){
        double rpg = (double)totalRebounds/gamesPlayed;
        return rpg;
    }

    public String toString(){
        String str = "Name: "+name+"\n"+"Height:"+height+"\n"+"PPG: "+PPG()+"\n"+"RPG:"+RPG();
        return str;
    }

    public void setName(String theName){
        name = theName;
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }
}
