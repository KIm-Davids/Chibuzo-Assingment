import java.util.Arrays;
	public class FireDrillAssignment {
		public static int[] performAction(int[] collectInput) {
	
	int counter = 0;
	
	int array = collectInput.length + 3;
	int[] anotherArray = new int[array];

	for(counter = 0; counter < collectInput.length; counter++) {
	anotherArray[counter] = collectInput[counter ];
	anotherArray[counter + 3] = anotherArray[counter] * 2;
	}
	

		return anotherArray;
	}





	public static void main(String[] args) {

		int[] array = {4,5,8};


		System.out.print(Arrays.toString(performAction(array)));

	}
}