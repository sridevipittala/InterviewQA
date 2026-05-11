package com.bo.searchAlgorithms;

public class SearchAlgorithms {

	public static void main(String[] args) {
		int a[] = { 2, 3, 6, 8, 9, 12, 34, 56 };
		int target = 9;
		int linearSearchResult = linearSearch(a, target);
		if (linearSearchResult == -1) {
			System.out.println(target + " not found ");
		} else {
			System.out.println(target + " found at index:\"+linearSearchResult);\n");
		}

		int binarySearchResult = binarySearch(a, target, 0, a.length);
		if (binarySearchResult == -1) {
			System.out.println(target + " not found ");
		} else {
			System.out.println(target + " found at index:" + binarySearchResult);
		}
	}

	private static int binarySearch(int[] a, int target, int left, int right) {
		int mid = 0;
		int steps = 0;
		while (left <= right) {
			steps++;
			mid = (left + right) / 2;
			if (target == a[mid]) {
				System.out.println("Binary seach Steps:" + steps);
				return mid;
			} else if (a[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		System.out.println("Binary search Steps:" + steps);
		return -1;
	}

	private static int linearSearch(int[] a, int target) {
		int steps = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				System.out.println("linear Search Steps:" + steps);
				return i;
			}
			steps++;
		}
		System.out.println("linear Search Steps:" + steps);
		return -1;
	}
}
