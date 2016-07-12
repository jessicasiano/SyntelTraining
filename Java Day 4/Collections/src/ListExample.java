import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i: arr){
			list1.add(i);
		}
		
		System.out.println(list1);
		
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
