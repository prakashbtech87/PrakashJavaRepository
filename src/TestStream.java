import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {

		List<String> days = Arrays.asList("Sunday", "Monday");

		System.out.println("Before  :" + days);
		List<String> upperCaseDays = days.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println("After :" + upperCaseDays);

	}

}
