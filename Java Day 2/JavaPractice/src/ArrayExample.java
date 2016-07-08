
public class ArrayExample {

	public static void main(String[] args) {
		//create a 2x3 table
		int[][] matrix = new int[2][3];
		
		//initialize the first row
		matrix[0][0] = 100;
		matrix[0][1] = 45;
		matrix[0][2] = 78;
		
		//initialize row 2
		matrix[1][0] = 56;
		matrix[1][1] = 42;
		matrix[1][2] = 34;
		
		for(int r = 0; r < matrix.length; r++){
			//once pointer is set at row, search through the columns
			for(int c = 0; c < matrix[r].length; c++){
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------");
		
		for(int[]r : matrix){
			for(int ele : r){
				System.out.print(ele + "\t");
			}
			System.out.println("");
		}

	}

}
