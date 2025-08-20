package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class marksGradingSys {
	public String grade(double m, double t) {
		String grade = "NA";
		double avg = (m/t)*100;
		if(avg<25) {
			grade = "F";
		}else if(25<avg && avg<45) {
			grade = "E";
		}else if(45<avg && avg<50) {
			grade = "D";
		}else if(50<avg && avg<60) {
			grade = "C";
		}else if(60<avg && avg<80) {
			grade = "B";
		}else {
			grade = "A";
		}
		return grade;
	}
}

public class _28_MarksGradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the MarksObtained and Total Mark: ");
		String input = sc.nextLine();
		List<Integer> marks = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		marksGradingSys mg = new marksGradingSys();
		String g = mg.grade(marks.get(0), marks.get(1));
		System.out.println("Output: "+g);
		sc.close();
	}
}
