package javaProgramms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamIntermediateOperations {

	public static void main(String[] args) {
		//1
		//filter() filter elements based on the conditions
		
		List<String> names = Arrays.asList("Kinnes","King","Mani","Kishore","Bvi");
		List<String> filterNames = names.stream().filter(name->name.startsWith("K")).collect(Collectors.toList());
		System.out.println(filterNames);
		
		//2
		//map() transform each elements in the stream
		List<String> namesList = Arrays.asList("Kinnes","King","Mani","Kishore","Bvi");
		List<String> upperCaseNames = namesList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseNames);
		
		//3
		//sorted() - sorts elements in natural order or using comparator
		List<Integer> numbers = Arrays.asList(2,5,7,10,5);
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		//4
		//distinct() - to remove duplicate elemennts form the stream
		List<Integer> removeDuplicates = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicates);
		
	}

}
