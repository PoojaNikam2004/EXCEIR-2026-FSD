package day5;

public class MaxNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
		{10, 20, 5},
		{30, 15, 25},
		{8, 40, 12}
		};

		for (int i = 0; i < arr.length; i++) {
		int max = arr[i][0];

		for (int j = 1; j < arr[i].length; j++) {
		if (arr[i][j] > max) {
		max = arr[i][j];
		}
		}

		System.out.println("Maximum in row " + (i + 1) + " is " + max);
		}

		}

		
		
		
		
	}


