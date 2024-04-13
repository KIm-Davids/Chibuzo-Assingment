public class ArrayKata {
	
	public static int maximumIn(int[] maximumIn) {

	int max1 = 0;
	for(int count = 0; count<maximumIn.length;count++){
		if(maximumIn[count] > max1){
			max1 = maximumIn[count];
		}
		
	}
		return max1;
}


	public static int minimumIn(int[] minimumIn) {
	
	int min1 = 0;
	
	for(int count = 0; count < minimumIn.length; count++) {
		if(minimumIn[count] < min1) {
			min1 = minimumIn[count];
		}
	}
		return min1;
}



	public static int sumOf(int[] sumOf) {
	

	int sum = 0;
		
	for(int count = 0; count < sumOf; count++) {
		
	sum += sumOf[count];

}
		return sum;

}
		
	
	public static int sumOfArrayOf(int[] sumOfArrayOf) {
	
	

	int sum = 0;
	

	for(int index = 0; index < sumOfArrayOf.length; index++) {
	if(sumOfArrayOf % 2 == 0) {
	 sumOfArrayOf[index];
	   }
	sum += evenNumbers;

			}
		
		return sum;
}
	
	

	public static int sumOfOddNumbers(int [] sumOfOddNumbers) {
	
	int[] myArray = new int[sumOfOddNumbers];
	
	int oddNumbers = 0;
	int sum = 0;
	int sumOfOddNumbers = 0;
	
	for(int index = 0; index < sumOfOddNumbers; index++) {
	if(sumOfOddNumbers[index] % 2 == 1) {
	oddNumbers = sumOfOddNumbers[index];
	}
	sum += oddNumbers;

			}
		
	   return sum;
	}


	public static int maxAndMin(int[] maxAndMin) {
	
	
	int max1 = maxAndMin[0];
	int min1 = maxAndMin[0];
	
	for(index = 0; index < maxAndMin.length; index++) {
	if(maxAndMin[index] > max1){

	max1=maxAndMin[index];
            }
	else {
	  max1 = maxAnMin[index];
  	}
         return max1;
	}



	public static int noOfOddNumbers(int[] number) {
	
	int oddNumbers[];


	for(index = 0; index < number.length; index++) {
	
	if(number[index] % 2 == 1) {
	oddNUmbers++; 
	}
	}

	return oddNumbers;
}



	public static int noOfEvenNumberIn(int[] number) {

	int evenNumbers[];
	
	for(index = 0; index < number.length; index++) {

	if(number[index] % 2 == 0) {
	evenNumbers++;
	}

	}
	return evenNumbers++;
	}

	

	public static int evenNumbersIn(int[] number) {

	int evenNumbers[];

	for(index = 0; index < number.length; index++) {

	if(number[index] % 2 == ) {
		evenNumbers = evenNumber[index];
		}
		}
	return evenNumbers++;
	}

	


	public static int squareNumbersIn(int[] number) {

	int multiples[];

	for(index = 0; index < number.length; index++) {
	
	multiples *= number[index];
	}
	return multiples++;
	}















	