package learnJavaProblems;

import java.util.Scanner;

class weeks {
	public String weekDayorEnd(String d) {
		String day="your entered day is not a day, Please Enter correct day";
		if(d.contains("saturday")||d.contains("sunday")) {
			day = "WeekEnd";
		}else if(d.contains("monday")||d.contains("tuesday")||d.contains("wednesday")||d.contains("thursday")||d.contains("friday")){
			day = "WeekDay";
		}
		return day;
	}
}

public class _20_WeekendOrWeekday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Day: ");
		String d = sc.next();
		weeks we = new weeks();
		String result = we.weekDayorEnd(d.toLowerCase());
		System.out.println("Output: "+result);
		sc.close();
		
		

	}

}
