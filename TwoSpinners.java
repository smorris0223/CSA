public class TwoSpinners {
    public int spin(int min, int max){
        int s = (int) Math.random()*max +min;
        return s;
    }
    public void playRound(){
       int p = spin(1, 10);
       int c = spin(2,8);
       System.out.println(p);
       System.out.println(c);
       int diff = p-c;

       if(diff>0){System.out.println("You Win! "+ diff+" points");}
       else if(diff<0){System.out.println("You Lose. "+ diff+" points");}
       else{
        int p1 = spin(1, 10);
       int c1 = spin(2,8);
       System.out.println(p1);
       System.out.println(c1);
       int diff1 = p1-c1;
       
       }
    }
}
