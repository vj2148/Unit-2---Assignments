import java.util.Scanner;



public class VendingMachine {
	private double amountOfMoney;
	private int productNumber;
	public static final double PRODUCT1 = 1.25;
	public static final double PRODUCT2 = 3.50;
	public static final double PRODUCT3 = 2.00;
	public static final double PRODUCT4 = 6.50;
	public static final double PRODUCT5 = 1.75;

	//in this method the user enters in the product number
	public int getProductNumber(){
		Scanner keyboard = new Scanner(System.in);
		productNumber = keyboard.nextInt();
		
		if(productNumber == 0){
			System.out.println("Thanks for shopping.");
			System.exit(0);
		}
		
		return productNumber;
	}
	
	//in this method the user enters in the amount of money until it is greater than or equal to the product chosen
	public double getMoney(){
		double money = 0;
		Scanner keyboard = new Scanner(System.in);
		
		while(money < getProduct(productNumber)){
			double amountEntered = keyboard.nextDouble();
			
			if(amountEntered == 5.00){
				money += amountEntered;
				if(money < getProduct(productNumber)){
					System.out.println("You still need to enter $" + (getProduct(productNumber) - money));
				}
			}else if(amountEntered == 1.00){
				money += amountEntered;
				if(money < getProduct(productNumber)){
					System.out.println("You still need to enter $" + (getProduct(productNumber) - money));
				}
			}else if(amountEntered == .25){
				money += amountEntered;
				if(money < getProduct(productNumber)){
					System.out.println("You still need to enter $" + (getProduct(productNumber) - money));
				}
			}else if(amountEntered == .1){
				money += amountEntered;
				if(money < getProduct(productNumber)){
					System.out.println("You still need to enter $" + (getProduct(productNumber) - money));
				}
			}else if(amountEntered == .05){
				money += amountEntered;
				if(money < getProduct(productNumber)){
					System.out.println("You still need to enter $" + (getProduct(productNumber) - money));
				}
			}else if(amountEntered == .01){
				money += amountEntered;
				if(money < getProduct(productNumber)){
					System.out.println("You still need to enter $" + (getProduct(productNumber) - money));
				}
			}else if(amountEntered == 0){
				System.out.println("Thanks for shopping.");
				System.exit(0);
			}else {
				System.out.println("Can't accept that amount of money.");
			}
		}
		
		return money;
	}
	
	//this method takes the product number and matches it to the correct constant variable
	public static double getProduct(int pm){
		int product = pm; 
		double amount = 0;
		
		if(product == 1){
			amount = PRODUCT1;
		}else if(product == 2){
			amount = PRODUCT2;
		}else if(product == 3){
			amount = PRODUCT3;
		}else if(product == 4){
			amount = PRODUCT4;
		}else if(product == 5){
			amount = PRODUCT5;
		}
		
		return amount;
	}
	
	//this method prints out the change in coins
	public void returnChange(double a){
		double change = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		if(a > getProduct(productNumber)){
			change = (a - getProduct(productNumber)) * 100;
		}
		
		quarters = (int)(change/25);
		change = change%25;
		dimes = (int)(change/10);
		change = change%10;
		nickels = (int)(change/5);
		change = change%5;
		pennies = (int)change;
		
		System.out.println("You should receive  \n" + 
							"Quarters: " + quarters + "\n" +
							"Dimes: " + dimes + "\n" +
							"Nickels: " + nickels + "\n" +
							"Pennies: " + pennies);
		System.out.println("Thanks for shopping.");
		System.out.println();
	}

}
