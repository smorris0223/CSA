public class condTest {
    public static void main(String [] args){
        Conditionals c= new Conditionals();
        System.out.println("");
        System.out.println("chimpTrouble");
        System.out.println(c.chimpTrouble(true, true));
        System.out.println(c.chimpTrouble(false, false));
        System.out.println(c.chimpTrouble(true, false));
        System.out.println(c.chimpTrouble(false, true));
        

        System.out.println("");
        System.out.println("negPos");
        System.out.println(c.negPos(1,-1,false));
        System.out.println(c.negPos(-1,1,false));
        System.out.println(c.negPos(1,1,false));
        System.out.println(c.negPos(-1,-1,false));
        System.out.println(c.negPos(-4,-5,true));
        System.out.println(c.negPos(-4,5,true));
        System.out.println(c.negPos(4,5,true));
        System.out.println(c.negPos(4,-5,true));

        System.out.println("");
        System.out.println("pickUpPhone");
        System.out.println(c.pickUpPhone(false, false, true));
        System.out.println(c.pickUpPhone(true, true,true));
        System.out.println(c.pickUpPhone(true,true,false));
        System.out.println(c.pickUpPhone(false, true, false));
        System.out.println(c.pickUpPhone(true,false,false));
        System.out.println(c.pickUpPhone(false, false, false));

        System.out.println("");
        System.out.println("setAlarm");
        System.out.println(c.setAlarm(1, false));
        System.out.println(c.setAlarm(5, false));
        System.out.println(c.setAlarm(0, false));
        System.out.println(c.setAlarm(2, true));
        System.out.println(c.setAlarm(4, true));
        System.out.println(c.setAlarm(6, true));

        System.out.println("");
        System.out.println("onesDigitSame");
        System.out.println(c.onesDigitSame(23,19,13));
        System.out.println(c.onesDigitSame(23,19,12));
        System.out.println(c.onesDigitSame(23,19,3));
        System.out.println(c.onesDigitSame(423,13,3));
        System.out.println(c.onesDigitSame(23,29,25));

        System.out.println("");
        System.out.println("blackjack");
        System.out.println(c.blackjack(19,21));
        System.out.println(c.blackjack(21,19));
        System.out.println(c.blackjack(19,22));
        System.out.println(c.blackjack(8,8));
        System.out.println(c.blackjack(25,24));
        System.out.println(c.blackjack(17,9));
        System.out.println(c.blackjack(12,18));
    }
}
