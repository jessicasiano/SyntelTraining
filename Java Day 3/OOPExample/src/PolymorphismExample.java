class Projector{
	public void turnOn(){
		System.out.println("Unit is on");
	}
	public void turnOff(){
		System.out.println("Unit is off");
	}
}

class Projector11 extends Projector{
	
	public void zoom(){
		System.out.println("Zoom image");
	}
	public void focus(){
		System.out.println("Focus");
	}
}

class Projector12 extends Projector11{
	public void zoom(){
		System.out.println("Zoom image (Updated)");
	}
	public void freeze(){
		System.out.println("Screen Frozen");
	}
	public void autoTurnOff(){
		System.out.println("Unit has turned off due to lack of use");
	}
}


public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Projector12 s = new Projector12();
		s.turnOn();
		s.zoom();
		s.freeze();
		s.autoTurnOff();
		
		Projector p = new Projector11();
		Projector11 p1 = (Projector11)p;
		
		Projector[] list = {s, p, p1};

		for(Object pr:list){
			if(pr instanceof Projector11){
				Projector11 temp = (Projector11)pr;
				temp.zoom();
				
			}
			else if(pr instanceof Projector12){
				Projector12 temp = (Projector12)pr;
				temp.autoTurnOff();
			}
		}
		
		
	}

}
