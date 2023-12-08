public class WhileLoops{

    public static void main(string[] args){
public static int addOdds(int n){
    int sum = 0;
    while(n>=1){
        if(n%2!=0){sum+=n;}
    n--;}
    return sum;
}

public int sumDigits(int n){
    return 0;
}

public int howManyYears(double startpop, double endpop){
    int y = 0;
    while(startpop<endpop){
        y++;
        startpop+=(startpop*.0113);
    }
    return y;
}

public void printSum(int n){
int x = 1;
int y = 0;
while (x<=n){
System.out.print(x + " + ");
y+=x;
x++;
}
System.out.println("=" +y);
}

public boolean isPerfectSquare(int n){
    int x=1;
    while(x<n){
     x+=2;   
    }
    return x==n;
}
}
}
