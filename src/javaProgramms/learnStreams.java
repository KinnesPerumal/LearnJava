package javaProgramms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class learnStreams {

	public static void main(String[] args) {
		//1
		//from collections(map, list, set)
		//colletion in java has a stream() method
		List<String> names = Arrays.asList("Kinnes","Bhavya","Suganthan");
		names.stream().forEach(System.out::println);
		
		//2
		//from Arrays
		//array.stream() to create stream for an array
		int[] number = {1,12,3,4,8,6};
		IntStream numberStream = Arrays.stream(number);
		numberStream.forEach(System.out::println);
		
		//3
		//Using stream.of() creats a stream from indiviudal elements of an array
		Stream<String> fruits = Stream.of("Apple","Banana","pine");
		fruits.forEach(System.out::println);
		
		//4
		//generating Streams
		//Stream.generate() - to create an infinite stream of values
		Stream<String> helloStream = Stream.generate(() -> "Hello").limit(3);//withoutlimit it executes infinitly
		helloStream.forEach(System.out::println);
		
		//5
		//Stream.iterate()
		//generating number starting from 4
		Stream<Integer> streamIterate = Stream.iterate(2, n->n+1).limit(6);
		streamIterate.forEach(System.out::println);

	}

}
