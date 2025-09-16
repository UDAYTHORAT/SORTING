import java.util.Arrays;

public class Quick_Sort
{
	public static void main(String[] args)
	{
		int [] arr = {4,6,3,1};


		QuickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static  void QuickSort(int [] arr, int low ,int high){
		if(low<high){
			int pivot = Partition(arr,low,high);

			QuickSort(arr,low,pivot-1);
			QuickSort(arr,pivot+1,high);
		}

	}
	static int Partition(int [] arr, int low ,int high){
		int piovt = arr[high];
     	int i=low-1;
		for (int j = low; j <high ; j++)
		{
			if(arr[j]<piovt){
				i++;
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;

	}

}
