import java.util.*;

public class SetExample {

	public static Set getData(){
		int arr[] = {10, 12, 15, 48};
		List myList = Arrays.asList(arr);
		Set temp = new TreeSet();
		for(int e : arr)
			temp.add(e);
		
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new TreeSet();
		s.add(12);
		s.add(25);
		s.add(12);
		s.add(100);
		
		System.out.println(s);
		
		Set s1 = getData();
		System.out.println(s1.toString());

	}

}
