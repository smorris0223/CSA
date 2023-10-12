public class MathEx {

//swap
        public static void main(String[] args){
            System.out.println(swap(132));
            System.out.println(swap(235));
            System.out.println(swap(798));
            
           System.out.println(dayOfWeek(0,1));
            System.out.println(dayOfWeek(0,14));
            System.out.println(dayOfWeek(6,22));
            System.out.println(dayOfWeek(5,4));
            System.out.println(dayOfWeek(1,24));
            System.out.println(dayOfWeek(2,1));
            timeLeft(1,15,4,36);
            timeLeft(1,34,8,20);
        }
   
   
        public static int swap(int x){
            int hundreds = x/100*100;
            int tens = x%100 /10;
            int ht = hundreds + (tens*10);
            int ones = x-ht;
            int result= hundreds+(ones*10)+tens;
            return result;
        }






   
        public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
                int curTime = curHour*60 + curMin;
                int deptTime = depHour*60+ depMin;
                int time = deptTime-curTime;
                int h = time/60;
                int m = time % 60;
                System.out.println(h +" hours and " + m + " minutes.");
        }
   


public static int dayOfWeek(int jan, int date){
    date+=6;
    int a=date%7;
    int b=a+jan;
    b=b%7;
    return b;
}}
