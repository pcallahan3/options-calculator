package options_calculator;
import java.util.Scanner;

public class OptionsCalculations {
	
	final static int CONTRACT_MULTIPLE = 100;

	//Calculate the sum of option contracts and price
	public static void main(String[] args) {
		
	Scanner contractNumber = new Scanner(System.in);
	Scanner contractPrice = new Scanner(System.in);
		
	System.out.println("How many contracts?:");
	int contractInput = contractNumber.nextInt();
	System.out.println("----------------------");
	System.out.println("What is the price?:");
	double priceInput = contractPrice.nextDouble();
		
	calculateTheSumOfContracts(contractInput,priceInput);
		
	}

public static void calculateTheSumOfContracts(int contracts,double price) {
	int sumOfContracts = (int) ((contracts * price) * CONTRACT_MULTIPLE);
	System.out.println("The purchase price of the option contracts is: $" + sumOfContracts);
	}
}