package com.java.algorithms.backtobasics;

public class BubbleSortAlgorithm {

	public BubbleSortAlgorithm() {
			
	}
	public static void main(String[] args) {
		int[] numbersToSort = {-12, -4, -6, 7, 28, 56, 2, 0};
		
		BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
		bubbleSort.bubbleSortArray(numbersToSort);
	}
	
	public void bubbleSortArray(int[] numbers) {
		int n = numbers.length;
		
		for(int i : numbers) {
			System.out.print(i);
			System.out.print(", ");
		}
		
		System.out.println();
		
		for(int times=1;times<n-1;times++) {
			for(int j=0;j<=n - times - 1;j++) {
				if (numbers[j] > numbers[j+1]) {
					int temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		for(int i : numbers) {
			System.out.print(i);
			System.out.print(", ");
		}
		
		System.out.println();
	}
}
