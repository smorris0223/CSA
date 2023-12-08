public class Factorials{

  public static long calcFactorial(int n){
    long product=1;
    while(n>1){
      product*=n;
       n--;
    }
    return product;
  }

public static double calcE(){
  double olde=0;
  double e=1;
  int x = 1;
  while(e-olde>.001){
    olde=e;

    e+=(1.0/calcFactorial(x));
    x++;
  }
  return e;
}

public static double calcEX(int x){
  int n = 1;
  double olde=0;
  double e= 1;
  while (e-olde>.001){
    olde=e;
    double num = Math.pow(x, n);
    double den = calcFactorial(n);
    e+=(num/den);//COULD all be done on one line but it found it looks really cluttered
    n++;
  }
return e;
}

public static void main(String[] args) {
  for(int x = 1; x<=20; x++){
    System.out.println(calcFactorial(x));
  }
  System.out.printf("e is %2.3f \n", calcE());
  for(int x = 1; x<=5; x++){
    System.out.printf("e^" + x +"  is %2.3f \n", calcEX(x));
  }
}

}

