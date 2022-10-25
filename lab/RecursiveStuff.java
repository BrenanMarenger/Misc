package lab;

public class RecursiveStuff {

	// Client is required to pass in a non-negative number of stars
	public static void stars(int numberOfStars) {
		if (numberOfStars == 0) {
			return;
		} else {
			stars(numberOfStars - 1);
			System.out.print('*');
		}
	}

	public static void upTriangle(int numberOfRows) {
		if (numberOfRows == 0) {
			return;
		} else {
			upTriangle(numberOfRows - 1);
			System.out.println();
			stars(numberOfRows);

		}
	}

	public static void downTriangle(int numberOfRows) {
		if (numberOfRows == 0) {
			return;
		} else {
			stars(numberOfRows);
			System.out.println();
			downTriangle(numberOfRows - 1);
			

		}
	}
	
	//example
	public int triangle(int row) {
		if(row==0) {
			return 0;
		}else {
			return row + triangle(row-1);
		}
		
	public int power( int m, int n) {
		if(n==0) {
			return 1;
		}else {
			return m*power(m,n-1);
		}
	}
		
		
	}

}
