package javaProgramms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamTerminalOperations {

	public static void main(String[] args) {
		//1
		//forEach() performs an action on each elements
		List<String> names = Arrays.asList("Kinnes","Bavya","Kishore");
		names.stream().forEach(System.out::println);
		
		//2
		//Collect() - collects elements into a collecation like a list or set
		List<Integer> numbers = Arrays.asList(1,2,3,4,23,34,12);
		List<Integer> collectionNumbers = numbers.stream().collect(Collectors.toList());
		System.out.println(collectionNumbers);
		
		//3
		//count() - Retrun the Numberof elements in the stream
		long count =numbers.stream().count();
		System.out.println(count);
		
		//4
		//reduce() - combine elements into a single value
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		
	}

}
