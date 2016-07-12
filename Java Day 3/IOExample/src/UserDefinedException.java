
public class UserDefinedException {
	public static void checkAge(int age) throws AgeException{
		if(age < 18){
			throw new AgeException("Age should not be under 18");
		}
	}
	
	public static void main(String[] args){
		try{
			UserDefinedException.checkAge(10);
		}
		catch(AgeException a){}
	}

}

class AgeException extends Exception{
	AgeException(String s){
		super(s);
	}

}
