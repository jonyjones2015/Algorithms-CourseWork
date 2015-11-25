public class insertionSortAlgorithm{
	public insertionSortAlgorithm(a,n){
		// Input: An array A storing n integers.
  		// Output: Array, A, sorted in non–descending order.
		for(int i=0; i < n-1; i++){
			item = a[i];
			j = i-1;
			while(j >= 0 && a[j] > item){
				a[j+1] = a[j];
				j = j -1;
			}
		}
		System.out.prinln(a);
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
