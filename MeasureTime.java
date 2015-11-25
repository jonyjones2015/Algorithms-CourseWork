import java.util.Random;
public class MeasureTime{


	// public MeasureTime(){

	// }

	public static void randomArrayTestPerformance(){
		Random randArray = new Random();
		double averageArray = 0;
		for(int b=0;b<10000;b+=100){
			for(int i=0;i<50;i++){
				//creates a random array with a elements and times it
				long startTime = System.nanoTime();
				RandomArray.randomArray(b);
				long estimatedTime = System.nanoTime()- startTime;
				//records the time and puts in array to be calculated later
				averageArray = averageArray+estimatedTime;
				//System.out.println(estimatedTime);
			}
			System.out.println(averageArray/(double)50);
			averageArray = 0;
		}
	}

	public static void sortArrayPerformance(){

		Random randArray = new Random();
		double averageArray = 0;
		for(int b=0;b<10000;b+=100){
			for(int i=0;i<50;i++){
				//creates a random array with a elements and times it
				long startTime = System.nanoTime();
				RandomArray t2 = new RandomArray(b);
				int[] a = randomArrayTestPerformance();
				
				long estimatedTime = System.nanoTime()- startTime;
				//records the time and puts in array to be calculated later
				averageArray = averageArray+estimatedTime;
				//System.out.println(estimatedTime);
			}
			System.out.println(averageArray/(double)50);
			averageArray = 0;
		}
	}

	// public void searchArrayPerformance(){

	// }

}
