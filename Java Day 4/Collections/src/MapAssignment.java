import java.util.*;

public class MapAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set employeeId = new TreeSet();
		employeeId.add(5034828);
		employeeId.add(5034585);
		employeeId.add(5038968);
		employeeId.add(5034968);
		employeeId.add(5038548);
		
		String[] employeeNames ={"Jessica", "Jason", "Nicole", "Nicolas", "Oliver"};
		
		Map employees = new TreeMap();
		Iterator it = employeeId.iterator();
		int i = 0;
		
		while(it.hasNext()){
			employees.put(it.next(), employeeNames[i]);
			i++;			
		}
		
		System.out.println(employees);
	}

}
