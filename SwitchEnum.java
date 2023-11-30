

public class SwitchEnum {
    private enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
		THURSDAY, FRIDAY, SATURDAY};
	
	public void enumMe(DayOfWeek d)
	{
		switch (d)
		{
		case SUNDAY:
		case SATURDAY:
			System.out.println("weekend");
			break;
		case WEDNESDAY:
			System.out.println("Hump Day");
			break;
		case MONDAY:
			System.out.println("I hate Mondays");
			break;
		default:
			System.out.println("Week Day");
			break;
		}
		
		System.out.println(DayOfWeek.THURSDAY);
		
	}
	public void ifMe(int what)
	{
		if(what ==1)
			System.out.println("One singular sensation.");
		else if (what == 2)
			System.out.println("Two can be as bad as one.");
		else if (what == 3)
			System.out.println("Knock three times.");
		else if(what == 5)
			System.out.println("Five golden rings.");
		else if(what == 8)
			System.out.println("Eight days a week.");
		else if (what == 4) {
			System.out.println("Song with 4.");
			System.out.println("Twenty Five or Six to Four.");
		}
		else if(what == 6 || what == 25)
			System.out.println("Twenty Five or Six to Four.");
		else
			System.out.println("Help!");
	}
	
	public void switchMe(int what)
	{
		switch(what) {
		case 1:
			System.out.println("One singular sensation.");
			break;
		case 2:
			System.out.println("Two can be as bad as one.");
			break;
		case 3:
			System.out.println("knock 3 times.");
			break;
		case 4:
			System.out.println("Song with 4.");
		case 6:
		case 25:
			System.out.println("Twenty Five or six to one.");
			break;
		default:
			System.out.println("Help!");
				
		}
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchEnum s = new SwitchEnum();
		s.ifMe(4);
		s.switchMe(4);
		
		s.enumMe(DayOfWeek.SATURDAY);
		s.song(1);

	}
	
	public void song(int line)
	{
		switch(line)
		{
		case 1:
		case 2:
			System.out.println("Buckle my shoe.");
			break;
		case 3:
		case 4:
			System.out.println("Shut the door.");
			break;
		case 5:
		case 6:
			System.out.println("Pick up sticks.");
			break;
		case 7:
		case 8:
			System.out.println("Lay them straight.");
			break;
		case 9:
		case 10:
			System.out.println("A big fat hen.");
			break;
		}
			
	}
}
