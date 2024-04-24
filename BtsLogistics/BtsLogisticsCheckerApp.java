import java.util.Scanner;
	public class BtsLogisticsCheckerApp {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.println("Enter number of delivery");
		int delivery = input.nextInt();


		BtsLogistics amountChecked = new BtsLogistics();
		int result = amountChecked.deliveryCalculator(delivery);

		System.out.print(result);

		}
}