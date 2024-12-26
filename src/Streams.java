import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {
	//count the number of names starting with A
	//@Test
	
 public void test() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alekhya");
		names.add("Butto");
		names.add("Canberra");
		names.add("Adam");
		names.add("Don");
		int count =0;
	 for (int i=0;i<names.size();i++) {
		 String actual = names.get(i);
		 if(actual.startsWith("A")) {
			 count++;
		 }
	 }
	 System.out.println(count);
}
//	@Test
	public void Streamfilter() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alekhya");
		names.add("Butto");
		names.add("Canberra");
		names.add("Adam");
		names.add("Don");
	Long c	=names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(c);
 Long d = Stream.of("Alekhya","Butto","canberra","Adam","Don").filter(s-> s.startsWith("A")).count();
 
 System.out.println(d);
	 names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	 names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void map() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alekhya");
		names.add("Butto");
		names.add("Canberra");
		names.add("Adam");
		names.add("Don");
		
//	names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Converting array to list
		
	List<String> Persons = Arrays.asList("Alekhya","Butto","canberra","Adam","Don");
	//Persons.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));//sorts the list as per dictionary order
	
	
	//merging two different list
	Stream<String> newStream = Stream.concat(names.stream(), Persons.stream());
//	newStream.forEach(s->System.out.println(s));
	
   boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam")); //if Adam is present in list or not,if present true else false
   Assert.assertTrue(flag);
	
	}
	@Test
	public void streamcollect() {
		//collect collects the results from previous methods and convert to list
	List<String> Students=	Stream.of("Alekhya","Butto","canberra","Adam","Don").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(Students.get(0));
	
//prints unique number from array and sort
	
List<Integer> values = Arrays.asList(3,2,1,4,5,6,7,1,2,5,4,4);
      values.stream().distinct().sorted().forEach(s->System.out.println(s));
   List<Integer> numbers = values.stream().distinct().sorted().collect(Collectors.toList());
   System.out.println(numbers.get(3));

	}
}


