package options_calculator;
import java.util.Scanner;

public class OptionsCalculations {
	
	final static int CONTRACT_MULTIPLE = 100;

	//Calculate the sum of option contracts and price
	public static void main(String[] args) {
		
		
	//Option cost calculator
	Scanner contractNumber = new Scanner(System.in);
	Scanner contractPrice = new Scanner(System.in);
		
	System.out.println("How many contracts?:");
	int contractInput = contractNumber.nextInt();
	System.out.println("----------------------");
	System.out.println("What is the price?:");
	double priceInput = contractPrice.nextDouble();
		
	calculateTheSumOfContracts(contractInput,priceInput);
		
	//Stock cost calculator
	Scanner numOfShares = new Scanner(System.in);
	Scanner priceOfShares = new Scanner(System.in);
	System.out.println("How many shares do you want to buy?");
	double shares = numOfShares.nextDouble();
	System.out.println("What is the price?");
	double price = priceOfShares.nextDouble();
	
	calculateTheSumOfTheShares(shares,price);
		
	}
	
//Calculates the cost of a lot of shares
public static void calculateTheSumOfContracts(int contracts,double price) {
	int sumOfContracts = (int) ((contracts * price) * CONTRACT_MULTIPLE);
	System.out.println("The purchase price of the option contracts is: $" + sumOfContracts);
}


//Calculates the cost of a lot of option contracts
public static void calculateTheSumOfTheShares(double shares,double price) {
	System.out.println("The sum of the shares is: $" + shares * price);
}


}