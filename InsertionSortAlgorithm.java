public class InsertionSortAlgorithm{
	public static void insertionSortAlgorithm(int[] a, int n){
		// Input: An array A storing n integers.
  		// Output: Array, A, sorted in non–descending order.
  		int item, j;
		for(int i=0; i <= n; i++){
			item = a[i];
			j = i-1;
			while(j >= 0 && a[j] > item){
				a[j+1] = a[j];
				j = j -1;

			}
			a[j+1] = item;
		}


		printArray(a);
	}

	public static void printArray(int[] a){
		for(int i=0;i< a.length;i++){
			System.out.println(a[i]);

		}
		System.out.println();
	}



public static void insertionSortAlgorithm(int[] arr){

	for (int i = 1; i < arr.length; i++) {
	            int valueToSort = arr[i];
	            int j = i;
	            while (j > 0 && arr[j - 1] > valueToSort) {
	                arr[j] = arr[j - 1];
	                j--;
	            }
	            arr[j] = valueToSort;
	        }
	printArray(arr);
 }
}

// Algorithm insertionSort(A, n)
//   Input: An array A storing n integers.
//   Output: Array, A, sorted in non–descending order.
//   for i=1 to n−1 do
//     item ← A(i)
//     j ← i − 1
//     while j ≥ 0 and A(j) > item do
//         A(j+1) ← A(j)
//         j ← j − 1
//     A(j+1) ← item

