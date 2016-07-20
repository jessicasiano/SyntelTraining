package modules;

public class Calculator {
	
	public int add(int x, int y){
		return x + y;
	}
	
	public boolean divisible(int x, int y){
		if(x % y == 0)
			return true;
		else
			return false;
	}
}
