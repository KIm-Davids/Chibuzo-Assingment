import java.util.*;
	public class StudentGradeTest {	
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int counter = 0;
		int index  =1;
		int noOfStudents;
		int score;
		int row;
		String string = "=";
		System.out.println("How many students do you have ? ");
		int students = input.nextInt();
	
		
		System.out.println("How many subjects do they offer ?");
		int subjects = input.nextInt();
	
		int[][] subjAndStudents = new int[students][subjects];
		

		
		for(counter = 0; counter  < subjAndStudents.length ; counter++) {

			System.out.println("Entering score for students " + (counter + 1));

			for(index = 0; index < subjects;index++){
				System.out.println("Enter score for subject " + (index + 1));
				subjAndStudents[counter][index] = input.nextInt();
				
				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");	
				System.out.println("Saved successfully\n");
					
			}
		}
			

		System.out.println("==================================================================" + string.repeat(subjects));
		System.out.print("STUDENTS");
	
		for(int column = 0; column < index; column++) {
			System.out.print("\tSUB" + (column + 1));
		}
		System.out.print("\tTOTAL");
		System.out.println("\tAVERAGE");
		System.out.println("=================================================================="+ string.repeat(subjects));


		ArrayList<Integer> position = new ArrayList<Integer>();
		int[] total = new int[subjAndStudents.length];
		int[] average = new int[subjAndStudents.length];
		int[] totalRow = new int[subjAndStudents.length];


		int column;

		for(row = 0; row < subjAndStudents.length; row++) {
			System.out.print("\nSTUDENT " + (row+ 1));	
		
		
			for(column = 0; column < subjects; column++) {

				System.out.print("\t " + subjAndStudents[row][column] + "");

				total[row] += subjAndStudents[row][column];
				average[row] = total[row] / subjects;
			}

		System.out.print("\t " + total[row]);
		System.out.print("\t " + average[row]);

		//Arrays.sort(total);
		
		for(int indexes = 0; indexes < subjAndStudents.length; indexes++){
		totalRow[indexes] += subjAndStudents[row][column];
		System.out.print("\t" + total[indexes]);
		}

		}

		

		
	



		//System.out.print(score);
		
	}
}

		


		