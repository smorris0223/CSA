public class TwoSpinners {
    public int spin(int min, int max){
        double s = Math.random()*max +min;
        return (int)s;
    }
    public void playRound(){
       int p = spin(1, 10);
       int c = spin(2,8);
       System.out.println(p);
       System.out.println(c);
       int diff = p-c;

       if (diff>0){
        if(diff==1){System.out.println("You Win! "+ diff+ " point");}
            else{System.out.println("You Win! "+ diff+ " points");}}    
       if (diff<0){
        if(diff==1||diff==-1){System.out.println("You lose. "+ diff+ " point");}
            else{System.out.println("You lose. "+ diff+ " points");}}
       else{
        int p1 = spin(1, 10);
       int c1 = spin(2,8);
       System.out.println(p1);
       System.out.println(c1);
       int diff1 = p1-c1;
       if (diff1>0){
        if(diff1==1||diff1==-1){System.out.println("You Win! "+ diff1+ " point");}
            else{System.out.println("You Win! "+ diff1+ " points");}}    
       else if (diff1<0){
        if(diff1==1){System.out.println("You lose. "+ diff1+ " point");}
            else{System.out.println("You lose. "+ diff1+ " points");}}
       else{System.out.println("Tie "+diff1+" points");}
       }
    }
    public static void main(String[] args) {
        TwoSpinners ds = new TwoSpinners();
            for(int i = 0; i < 10; i++){ 
              ds.playRound();
            }

}}
