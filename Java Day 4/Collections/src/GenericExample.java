import java.util.*;

public class GenericExample<T, k>{
	T var;
	k var2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(50);
		l.add(100);
		
		Map<String, Integer> m = new TreeMap<String, Integer>();
		
		GenericExample<Integer, String> o = new GenericExample<Integer, String>();
		o.var = 1;
		o.var2 = "Blah!";

	}

}
