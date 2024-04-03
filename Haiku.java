public class Haiku extends Poem {
    
    public Haiku(){
        super(3);
    }

    public int getSyllables(int k){
        if(k==2){
            return 7;
        }
        else{
            return 5;
        }
        
    }

    public void printRhythm(){
        for(int x = 1;x<=getNumlines();x++){
            for(int y = 1;y<=getSyllables(x);y++){
                System.out.print("ta");
                if(y!= getSyllables(x)){
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }




}
