import java.util.Arrays;

public class Merge_Sort_In_Place {
	public static void main(String[] args) {
		int [] arr = {4, 5, 3, 2, 69, 54, 1, 80, 10};

		// Call merge sort on the entire array
		MergeSortInPlace(arr, 0, arr.length);

		// Print the sorted array
		System.out.println(Arrays.toString(arr));
	}

	// Recursive merge sort function that works with array indexes
	static void MergeSortInPlace(int[] arr, int start, int end) {
		// Base case: if the subarray has 0 or 1 element, it is already sorted
		if (end - start <= 1) {
			return;
		}

		// Find the middle index of the current subarray
		int mid = (start + end) / 2;

		// Recursively sort the left half (from start to mid-1)
		MergeSortInPlace(arr, start, mid);

		// Recursively sort the right half (from mid to end-1)
		MergeSortInPlace(arr, mid, end);

		// Merge the two sorted halves into one
		MergeInPlace(arr, start, mid, end);
	}

	// Function to merge two sorted subarrays: arr[s..m-1] and arr[m..e-1]
	static void MergeInPlace(int[] arr, int s, int m, int e) {

		// Temporary array to hold the merged sorted result
		int[] newArr = new int[e - s];

		int i = s; // pointer for left half
		int j = m; // pointer for right half
		int k = 0; // pointer for newArr

		// Compare elements from both halves and copy the smaller one
		while (i < m && j < e) {
			if (arr[i] < arr[j]) {
				newArr[k] = arr[i];
				i++;
			} else {
				newArr[k] = arr[j];
				j++;
			}
			k++;
		}

		// Copy any remaining elements from the left half
		while (i < m) {
			newArr[k] = arr[i];
			i++;
			k++;
		}

		// Copy any remaining elements from the right half
		while (j < e) {
			newArr[k] = arr[j];
			j++;
			k++;
		}

		// Copy the merged sorted elements back into the original array
		for (int l = 0; l < newArr.length; l++) {
			arr[s + l] = newArr[l];
		}
	}
}
