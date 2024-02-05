package test.util;

import visualso.util.ArrayUtils;

public class ArrayUtilsTest {
	public static void main(String[] args) {
		int[] testArray = {4, 2, 5, 60, -1};
		
		// Test max()
		System.out.println(ArrayUtils.max(testArray));
		
		// Test min()
		System.out.println(ArrayUtils.min(testArray));
		
		// Test resize()
		int[][] test2DArray = {{4, 2, 3, 1}, {2, 3, 100, 50}};
		
		System.out.println(test2DArray.length);
		System.out.println(ArrayUtils.resizeIntegers(test2DArray).length);
		int [][] resizedArr = ArrayUtils.resizeIntegers(test2DArray);
		System.out.println(resizedArr.length);
		for (int i=0; i<test2DArray.length; i++){
			for (int j =0; j < test2DArray[i].length; j++){
				System.out.print(test2DArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i=0; i<resizedArr.length; i++){
			for (int j =0; j < resizedArr[i].length; j++){
				System.out.print(resizedArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
