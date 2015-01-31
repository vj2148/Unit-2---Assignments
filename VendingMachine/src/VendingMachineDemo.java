

public class VendingMachineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int productNumber = 0;
		double amountOfMoney = 0;
		
		//loops it an infinite number of times until the user enters in zero(0)
		for(int x = 1; x > 0; x++){
			VendingMachine vm = new VendingMachine();
			
			System.out.println("Choose a product.");
			System.out.println("1. $1.25 2. $3.50 3. $2.00 4. $6.50 5. $1.75");
			productNumber = vm.getProductNumber();									//the product the user chooses 
			
			System.out.println("Enter in the amount of money.");
			amountOfMoney = vm.getMoney();											//the amount of money the user entered in
			
			System.out.println("You bought product number " + productNumber + " for $" + amountOfMoney);
			vm.returnChange(amountOfMoney);
		}
		

	}

}
