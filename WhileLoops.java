public class WhileLoops{
    
public static int addOdds(int n){
    int sum = 0;
    while(n>=1){
        if(n%2!=0){sum+=n;}
    n--;}
    return sum;
}

public static int sumDigits(int n){
    int sum= 0;
    while(n>0){
        int x=n%10;
        sum+=x;
        n/=10;
    }
    return sum;
    }


public static int howManyYears(double startpop, double endpop){
    int y = 0;
    while(startpop<endpop){
        y++;
        startpop+=(startpop*.0113);
    }
    return y;
}

public static void printSum(int n){
    int x = 1;
    int y = 0;
    while (x<n){
        System.out.print(x + " + ");
        y+=x;
        x++;
}
System.out.println(n+" = " +(y+n));
}

public static boolean isPerfectSquare(int n){
    int x=1;
    while(x<n){
     x+=2;   
    }
    return x==n;
}
    public static void main(String[] args){
       System.out.println(addOdds(5));
       System.out.println(addOdds(6));
       System.out.println(addOdds(10));
       System.out.println(sumDigits(123));
       System.out.println(sumDigits(4444));
       System.out.println(sumDigits(221223));
       System.out.println(howManyYears(111.2,120));
       System.out.println(howManyYears(111.2,150));
       printSum(10);
       printSum(4);
       printSum(7);
       System.out.println(isPerfectSquare(25));
       System.out.println(isPerfectSquare(49));
       System.out.println(isPerfectSquare(10));
       System.out.println(isPerfectSquare(14));
}}

