import java.util.HashMap;
import java.util.Map;

public class TestMain {
	
	

	public static void main(String[] args) {
		
		Map<Employee, Integer> map = new HashMap<>();
		
		Employee e1 = new Employee("prakash", 34);
		Employee e2 = new Employee("prakash", 34);
		
		map.put(e1, 100);
		map.put(e2, 200);
		
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		
		
		
		

	}

}
