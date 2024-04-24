import java.util.Arrays;
import java.util.Scanner;

public class AnotherFireDrill {

	public static int[] readArray(int[] collectInput) {

		int counter = 0;

		for(counter = 0; counter < collectInput.length;counter++){
			if(collectInput[counter] % 2 == 1) collectInput[counter] = 1;
			else collectInput[counter] = 0;
		}

		return collectInput;
	}


	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int[] array = {4,5,8,8,8,2,9};
	System.out.print(Arrays.toString(readArray(array)));
}	

}	s