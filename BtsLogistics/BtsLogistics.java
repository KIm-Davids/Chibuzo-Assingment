public class BtsLogistics {
	public static int deliveryCalculator(int noOfDelivery) {


	int result = 0;

	if(noOfDelivery >= 70) {
	result = noOfDelivery * 500 + 5000;
	}

	if(noOfDelivery >= 61 & noOfDelivery <= 69) {
	result = noOfDelivery * 250 + 5000;
	}

	if(noOfDelivery >= 50 & noOfDelivery <= 60) {
	result = noOfDelivery * 200 + 5000;
	}

	if(noOfDelivery <= 49) {
	result = noOfDelivery * 160 + 5000;
	}
		return result;
	}
	
}
	

	