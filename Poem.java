public class Poem{
private int numberoflines;



public Poem(int n){
    numberoflines = n;
    
}

public Poem(){
    numberoflines = 1;
}

public int getNumlines(){
    return numberoflines;
}

public void printRhythm(){
    System.out.println("Free Verse!");
}}