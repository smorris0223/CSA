public class Limerick extends Poem{
    public Limerick(){
        super(5);
    }

    public int getSyllables(int k){
        if(k==3||k==4){return 6;}
        else{return 9;}
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
