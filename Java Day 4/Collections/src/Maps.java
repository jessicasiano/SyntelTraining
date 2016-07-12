import java.util.*;

public class Maps {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new TreeMap();
		map.put("D", 245);
		map.put("F", 89);
		map.put("A", 85);
		map.put("B", 100);
		
		System.out.println(map);
		
		Set keys = map.keySet();
		System.out.println(keys);
		
		for(Object o: keys){
			String k = o.toString();
			System.out.println(map.get(k));
		}
	}

}
