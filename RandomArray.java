import java.util.Random;
import java.util.Arrays;

public class RandomArray{

	public static int[] rArray;
	public static int size ;
	
	public static int[] randomArray(int n){

		//Make an array of length n
		int[] rArray =  new int[n];
		int size = n;
		Random rand = new Random(); 
		for(int i=0;i<n;i++){
			int a = rand.nextInt(n);
			rArray[i] = a;
		}
		//need to delete after use of 
		return rArray;
	}

	public static void printArray(){
		for(int a=0; a<size;a++){
			System.out.println(rArray[a]);
		}
	
	}

	public static void sortArray(int n){
		Arrays.sort(rArray);
	}

	public static void searchArray(int searchTerm){
		int num = Arrays.binarySearch(rArray, searchTerm);
		System.out.println(searchTerm + " is in postion " + num);
	}
}



// public class RandomArray{

	

// 	public RandomArray(int n){

// 		int[] randArray ;
// 		randArray = new int[n];

// 		Random rand = new Random(); 
// 		for(int i=0;i<n;i++){
// 			int a = rand.nextInt(100);
// 			randArray[i] = a;
// 		}
// 		// randarray = randArray;
// 	}

// 	public void printArray(){
// 		for(int a=0; a<randArray.size();a++){
// 			System.out.println(randArray.get(i));
// 		}
	
// 	}
// }
