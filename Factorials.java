public class Factorials{

  public int calcFactorial(int n){
    int product=1;
    while(n>1){
    product*=n;
      n--;
    }
    return product;
  }

  
  
}
