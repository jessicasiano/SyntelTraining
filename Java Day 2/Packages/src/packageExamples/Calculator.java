package packageExamples;

public class Calculator {
	public int[] add(int[] a, int[] b){
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
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int subtract(int a, int b){
		return a-b;
	}
	public int multiply(int a, int b){
		return a*b;
	}
}
