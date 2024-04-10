import java.util.Scanner;
	public class Factors {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);


		System.out.print("Enter a number: ");
		int num1 = input.nextInt();

		int factor = 0;
		int counter = 1;		

		for(counter = 1; counter <= 10; counter++) {
		 if(num1 % counter == 0) {
			factor++;
			}
			}
			counter++;
			System.out.print(factor);
		}
}