package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class triangleType {
	public String type(int x,int y,int z) {
		String type="NA";
		if(x+y>z && y+z>x && z+x>y) {
			if(x==y && y==z && z==x) {
				type = "Equilateral";
			}else if(x==y || y==z || z==x) {
				type ="Isosceles";
			}else if (x!=y && y!=z && z!=x) {
				type = "Scalene";
			}
		}
		return type;
	}
}
public class _27_TriangleType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 side Triangle sizes: ");
		String input = sc.nextLine();
		List<Integer> sideValues = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		triangleType tt = new triangleType();
		String  type = tt.type(sideValues.get(0), sideValues.get(1), sideValues.get(2));
		System.out.println(type);
		sc.close();

	}

}
