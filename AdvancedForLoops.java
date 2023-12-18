public class AdvancedForLoops {
public static void main(String[] args) {
    eights();
    isosceles(5);
    isosceles(9);
    upSideDown(9, 5);
    upSideDown(8,6);
    alternate(5);
    alternate(8);
}
    
public static void eights(){
    for(int a=8;a>=2;a-=2){
        for(int b=(a/2-4)*-1;b>0;b--){//increases by one each loop. ex)row 2 has one space because 6/2=3, and 3-4=-1 
            System.out.print(" ");
        }
        for(int c = a; c>=1;c--){
            System.out.print(a);
        }
        System.out.println();
    }
}

public static void alternate(int n){
    for(int i=1;i<=n;i++){
        if(i%2==1){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }}
        else{
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
        }
        System.out.println();
        }
    
        
    
}

public static void isosceles(int n){
    for(int i=1;i<=n+1;i++){
        for(int j=n-i;j>=0;j--){
            System.out.print(" ");
        }
        for(int k =1;k<i;k++){
            System.out.print(k);
        }
        for(int l = i-1;l>1;l--){
            System.out.print(l-1);
        }
        System.out.println();
    }
}

public static void upSideDown(int x, int y){
    int diff = x-y;
    for(int i =1;i<=diff+1;i++){
        for(int s=1;s<i;s++){
            System.out.print(" ");
        }
        for(int j = x-i+1;j>=y;j--){
            System.out.print(j);
        }
        for(int k = y+1;k<=x-i+1;k++){
            System.out.print(k);
        }
        System.out.println();
    }
}
}