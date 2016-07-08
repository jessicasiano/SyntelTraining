package Main;
import packageExamples.Calculator;
import scientificCalc.ScientificCalculator;

public class MainClass {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 5));
		
		ScientificCalculator sc = new ScientificCalculator();
		sc.display();

	}

}
