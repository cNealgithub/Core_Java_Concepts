package javaplayground;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//<-----------Switch Statement Type-1----------->
		String Day = "Sunday";
		switch(Day) {
		case "Monday","Wednesday":{
			System.out.println("Time:7:00 AM");
			break;
		}
		case "Sunday":{
			System.out.println("Time:8:00 AM");
			break;
		}
		default:{
			System.out.println("Time:7:30 AM");
		}
		}
		//<-------------Switch Statement Type-2 (lambda expressions)----------->
		int day = 5;
		switch(day) {
		case 1->System.out.println("Monday");
		
		case 2->System.out.println("Tuesday");
		
		case 3->System.out.println("Wednesday");
		
		case 4->System.out.println("Thursday");
		
		case 5->System.out.println("Friday");
		
		case 6->System.out.println("Saturday");
		
		case 7->System.out.println("Sunday");
		
		default->System.out.println("Enter valid day no.");
		}
		//<---------Switch As An Expression To Return A Value---------->
		String str = "Saturday";
		String result = null;
		result = switch(str) {
		case "Sunday","Saturday"->"8:00 AM";
		case "Monday"->"7:00 AM";
		default->"6:00 AM";
		};
		System.out.println(result);
		//<----------Way-2 TO Use Switch As An Expression---------->
		int weekday = 2;
		String Alarm = null;
		switch(weekday) {
		case 1->Alarm = "At: 6:00";
		case 6,7->Alarm = "At: 9:00";
		default->Alarm = "At: 7:00";
		}
		System.out.println("Alarm Time " + Alarm);
	}

}
