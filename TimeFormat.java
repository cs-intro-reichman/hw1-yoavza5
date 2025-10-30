// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String form = hours >= 12? "pm" : "am";
		if (hours >12 && hours < 24) 
		{
			hours = hours - 12;
			if (minutes < 10) 
			{
				System.out.println(hours + ":0" + minutes + " " + form);
			}	
			else
			{
				System.out.println(hours + ":" + minutes + " " + form);
			}
		}
		else
		{
			if (minutes<10) 
			{
				System.out.println(hours + ":0" + minutes + " " + form);
			}
			else
			{
				System.out.println(hours + ":" + minutes + " " + form);	
			}
		}
   
	}
}