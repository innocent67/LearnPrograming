package intro.java;

import java.util.Arrays;

public class LearningDataType {
	public static void main(String arg[]) {
		byte age =50;
		String message="Hello World";
		long viewCounts=3_235_456L;
		
		int matrix[][]= new int [2][3];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=2;
		System.out.println(Arrays.deepToString(matrix));
	}

}
