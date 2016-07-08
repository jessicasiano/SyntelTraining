
public class MainClass 
{

	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		int[] a = {12, 13,45,23,8,56,45,684,34,456,3,24};
		int[] b = {356,78,23,9,467,0,75,48,75,30};
		int[] x = calc.add(a, b);
		for(int i = 0; i < x.length; i++)
			System.out.print(x[i] + "\t");
		
		System.out.println("");
		System.out.println("----------------------------");
	
		DataTable dt = new DataTable();
		int matrix[][] = dt.getData();
		for(int[]r : matrix){
			for(int ele : r){
				System.out.print(ele + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("----------------------------");
		
		Object stuff[][] = dt.getData2();
		for(Object[]r : stuff){
			for(Object ele : r){
				System.out.print(ele.getClass().getName() + "\t");
			}
			System.out.println("");
		}
	}

}

class Calculator{
	int[] add(int[] a, int[] b){
		int l = Math.max(a.length, b.length);
		int[] ret = new int[l];
		for(int i = 0; i < a.length && i < b.length; i++)
				ret[i] = a[i] + b[i];
		if(l >b.length){
			for(int i = b.length; i < l; i++)
				ret[i] = a[i];
		}
		else if(l > a.length){
			for(int i = a.length; i < l; i++)
				ret[i] = b[i];
		}
		return ret;
	}
	
	int subtract(int a, int b){
		return a-b;
	}
}

class DataTable
{
	public int[][] getData()
	{
		int ret[][] = {{12, 25, 48, 79, 63},
				       {10, 12, 45}, 
					   {78, 58, 69, 52,36, 91},
				       {52, 14, 36, 59}};
		return ret;
	}
	public Object[][] getData2()
	{
		Calculator calc = new Calculator();
		Object ret[][] = {{"Ankit", "India", 12525.25, "ank@abc.com", 6525987523l},
				       {"Jessica", 9142999792l},
						{59, calc, 'a'}};
		return ret;
	}
}
