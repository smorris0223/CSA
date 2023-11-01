public class Conditionals{
    

public boolean chimpTrouble(boolean aSmile, boolean bSmile){
    if (aSmile== bSmile){
        return true;
    }
    else { return false;}
}

public boolean negPos(int a, int b, boolean negative){
    if(negative == true){
        if(a<0 && b<0){
            return true;
        }
        else{return false;}
    }
    else{
        if(a<0 && b>=0 || b<0 && a>=0){
            return true;
        }
        else{return false;}
    }
    
}

public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
    if(isAsleep==true){
        return false;
    }
    else if(isMorning==true){
        if (isMom==true){
            return true;
        }
        else{return false;}
    }
    else{return true;}
}

public String setAlarm(int day, boolean isVacation){
    if(isVacation==true){
        if (day==6||day==0){
            return "off";
        }
        else{ return "10:00";}
    }
    else{
        if (day==6||day==0){
            return "10:00";
        }
        else{return "7:00";}
    }
}

public boolean onesDigitSame(int a, int b, int c){
    int aOnes = a%10;
    int bOnes = b%10;
    int cOnes = c%10;
    if(aOnes==bOnes||bOnes==cOnes||cOnes==aOnes){
        return true;
    }
    else{return false;}

}

public int blackjack(int a, int b){
    if (a>b){
        if(a<=21){return a;}
        else{ 
            if(b<=21){return b;}
            else{return 0;}}
    }
    else if (b>=a){
        if(b<=21){return b;}
        else{
            if(a<=21){return a;}
            else{return 0;}
        }
    }
    else{return 0;}
}

}