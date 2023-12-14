public class ForLoops {

public static void main(String[] args) {
    System.out.println(addEvens(10));
    System.out.println(addEvens(6));
    System.out.println(addEvens(20));
    printSquaresBack(3);
    printSquaresBack(8);
    printSquaresBack(12);
    sillyNumbers();
    sillyNumbers2();
    dollarsAndStars();
}

public static int addEvens(int n){
    int sum=0;
    for(int k=2;k<=n;k+=2){
        sum+=k;
    }
    return sum;

}

public static void printSquaresBack(int n){
    for(int k=n; k>1; k--){
        System.out.print(k*k+", ");
    }
    System.out.println(1);//just so there isn't a comma at the end
}
    
public static void sillyNumbers(){
    for(int x=1;x<=3;x++){
        for(int y=0;y<10;y++){
            for(int z=1;z<=3;z++){
                System.out.print(y);
            }
        }
        System.out.println();
    }
}

public static void sillyNumbers2(){
    for(int x=1;x<=4;x++){
        for(int y=9;y>=1;y--){
            for(int z=y;z>=1;z--){
                System.out.print(y);
            }
        }
        System.out.println();
    }

}
//the outermost stars and dollar signs repeat, so this makes it less redundant
public static void dollars(int a){
    for(int c=7-a;c>=1;c--){
        System.out.print("$");
}}

public static void stars(int a){
    for(int b=0;b<2*a;b++){
        System.out.print("*");
        }
}
public static void dollarsAndStars(){

    for(int x=0;x<=6;x++){
        stars(x);
        dollars(x);
        for(int d=14-2*x;d>=1;d--){
            System.out.print("*");
        }
        dollars(x);
        stars(x);
    System.out.println();


    }
}}
