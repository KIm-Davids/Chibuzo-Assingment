import java.util.Scanner;
	public class BarChart {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	System.out.println("WELOCME\nENTER NUMBER TO CONTINUE");	
	int letter = input.nextInt();
	//int counter = 0;
	for(int i = 1; i < 5;i++) {
	
	System.out.println("Enter a number between 1 - 30");	
	int letter2 = input.nextInt();
	
	
	while(letter2 == 5 ){
	for(int counter = 0; counter <= 5; counter++){
	
	System.out.println("*");
	
	
	if(letter2 >= 30) {
	System.out.print("Error");
	
	}
	
	if(letter2 <= 0) {
	System.out.print("Try again");
	
	}
	
	
	int num2 = 1-30;
	break;
	}
			}
			
			
		}
		

		
	}
}
	