import java.util.Arrays;
import java.util.Scanner;
	public class FireDrillAssignment3 {
		public static boolean[] performAction(int[] collectInput) {

	boolean[] array = new boolean[collectInput.length];

	int counter = 0;
	for(counter = 0; counter < collectInput.length; counter++) {
	if(collectInput[counter] % 2 == 1) {
	array[counter] = true;
	}
	
	if(collectInput[counter] % 2 == 0)
	array[counter] = false;
	}
	
		return array;
		
	

}



	public static void main(String[] args) {

	
	Scanner input = new Scanner(System.in);

	int[] array = new int[7];


	System.out.print("How many times ? ");
	int number = input.nextInt();

	int counter = 0;

	for(counter = 0; counter < array.length; counter++) {
	
	System.out.print("Enter the number");
	array[counter] = input.nextInt();
	}
	
	System.out.print(Arrays.toString(performAction(array)));
}
}