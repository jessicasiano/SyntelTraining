
public class OOPExample2 {
	public static void main(String[] args){
		
	}

}

class System1{
	static PrintStream out = new PrintStream();
}
class PrintStream{
	public void println(String d){
		System.out.println(d);
	}
	public void println(float f){
		System.out.println(f);
	}
	public void println(String d, float f){
		System.out.println(d + " " + f);
	}
	public void println(Object o){
		System.out.println(o);
	}
	public void println(float f, String s){
		System.out.println(d + " " + f);		
	}
	
}
class c extends b{
	
}