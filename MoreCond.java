public class MoreCond{

    public boolean isLeapYear(int year){
        if (year%4==0){
            if (year%100==0){
                if(year%400==0){
                    return true;
                }
                else return false;
            }
            else return true;
        }
        else{return false;}
    }

    public boolean isSooner(int month1, int day1, int year1, int month2, int day2,int year2){
        if(year1!=year2){
            if(year1>year2){
                return false;
            }
            else return true;}
        else if(month1!=month2){
            if(month1>month2){
                return false;
            }
            else return true;}
        else if(day1!=day2){
            if(day1>day2){return false;}
            else return true;}
        else return false;}

    public int findBestFit(int space, int size1, int size2){
        if(size1+size2<=space){
            return 3;}
        else if(size1<=space){
            if(size1>=size2){return 1;}
            else if(size2>=space){return 1;}
            else{return 2;}
        }
        else{
            if(size2<=space){return 2;}
        else{return 0;}
        }
        }
    
    public boolean makeBenches(int small, int big, int goal){
        int b=big*5;
        if(b+small >= goal){
            if(goal%5<=small){return true;}
            else{return false;}
        }
        else{return false;}
    }
            
}
        
       
    
    
