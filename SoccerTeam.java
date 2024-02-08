public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int numGames=0;
    private static int totalpoints =0;

public SoccerTeam(){
    wins= 0;
    losses = 0;
    ties = 0;
}


    public void played(SoccerTeam other, int myscore,int otherscore){
        if (myscore>otherscore){
            this.wins++;
            other.losses++;
        }
        else if(otherscore>myscore){
            other.wins++;
            this.losses++;
        }
        else{
            this.ties++;
            other.ties++;
        }
        numGames++;
        totalpoints+=myscore+otherscore;
    }
    public int points(){
        return this.wins*3+this.ties;
    }
    public void reset(){
        this.wins=0;
        this.losses=0;
        this.ties=0;
    }

public static int getgames(){
    return numGames;
}
public static int gettotal(){
    return totalpoints;
}
public static void startTournament(){
    numGames=0;
    totalpoints=0;
}

public static void main(String[] args) {
    SoccerTeam t1 = new SoccerTeam();
    SoccerTeam t2 = new SoccerTeam();
    SoccerTeam t3 = new SoccerTeam();
    SoccerTeam t4 = new SoccerTeam();
    startTournament();
    t1.played(t2, 3, 5);
    t3.played(t4, 2, 1);
    t1.played(t3,1,1);
    t2.played(t4, 3, 2);
    System.out.println(gettotal());
    System.out.println(getgames());
    System.out.println(t1.points());
    System.out.println(t2.points());
    startTournament();
    System.out.println(totalpoints+", "+numGames);
    t1.played(t4, 4, 4);
    t2.played(t3, 2, 3);
    t3.played(t1,2,1);
    t4.played(t2, 1, 0);
    System.out.println(t3.points());
    System.out.println(t4.points());
    System.out.println(gettotal());
    System.out.println(getgames());

}

}
