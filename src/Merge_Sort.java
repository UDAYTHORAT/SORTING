import java.util.Arrays;

public class Merge_Sort
{
	public static void main(String[] args)
	{
		int [] arr= {33,122,2,12,34};

		int [] sol = MergeSort(arr);
		System.out.println(Arrays.toString(sol));
	}

	// Recursive Merge Sort function
	static int[] MergeSort(int [] arr){

		// Base case: if the array has only one element, it is already sorted
		if(arr.length == 1){
			return arr;
		}

		// Find the midpoint of the array
		int mid = arr.length / 2;

		// Recursively sort the left half (from index 0 to mid-1)
		int [] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));

		// Recursively sort the right half (from index mid to end)
		int [] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		/*
		 Note:
		 Arrays.copyOfRange(arr, from, to) creates a new array
		 containing elements from 'from' (inclusive) to 'to' (exclusive).
		*/

		// Merge the two sorted halves
		return Merge(left, right);
	}

	// Function to merge two sorted arrays into one sorted array
	static int[] Merge(int [] first, int [] second){

		// Create a new array large enough to hold both halves
		int [] sol = new int[first.length + second.length];

		int i = 0; // pointer for first array
		int j = 0; // pointer for second array
		int k = 0; // pointer for solution array

		// Compare elements from both arrays and copy the smaller one
		while (i < first.length && j < second.length){
			if(first[i] < second[j]){
				sol[k] = first[i];
				i++;
			} else {
				sol[k] = second[j];
				j++;
			}
			k++;
		}

		// Copy any remaining elements from the first array
		while (i < first.length){
			sol[k] = first[i];
			i++;
			k++;
		}

		// Copy any remaining elements from the second array
		while (j < second.length){
			sol[k] = second[j];
			j++;
			k++;
		}

		// Return the merged sorted array
		return sol;
	}
}
