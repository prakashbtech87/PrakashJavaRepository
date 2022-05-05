import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TestClass {

	public static void main(String[] args) {

		// Question 1
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 10, 15, 24, 25, 36, 45, 100, 101, 202);
		// please print only even numbers which are divisble by 5 using Java 8 Streams
		// API

		// Question 2
		// Given below string , please mask the user
		String s = "My email is admin@gmail.com";

		// Expected Output
		// My email is #####@gmail.com

		// Question 3
		// Please carefully see the below code ( this is in java 8 ) and predict the
		// outcomes
		TreeSet<StringBuffer> ts = new TreeSet<>();
		ts.add(new StringBuffer("K"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("P"));
		ts.add(new StringBuffer("a"));
		ts.add(new StringBuffer("S"));
		ts.add(new StringBuffer("A"));
		System.out.println(ts);//

	}
}
