import java.util.Scanner;

public class GroceryList {

public static void main(String []args)
	{
	double Milk=2.99;
	double Soda=1.99;
	double Bread=2.59;
	double Water=4.29;

	System.out.println("Welcome to My Grocery Store, Today's Specials are: ");
	System.out.println("Milk 2.99");
	System.out.println("Soda 1.99");
	System.out.println("Bread 2.59");
	System.out.println("Water 4.29");
	
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter the amount of milk: ");
	int a= kb.nextInt();
	
	System.out.print("Enter the amount of soda: ");
	int b= kb.nextInt();
	
	System.out.print("Enter the amount of bread: ");
	int c= kb.nextInt();
	
	System.out.print("Enter the amount of water: ");
	int d= kb.nextInt();
	int totalAmount= a+b+c+d;
	


	System.out.println("Your total is: $"+ a + b + c + d + totalAmount);
	
	 
	/*Then you will have the following 4 questions to get the number of each item
	You will have the user enter in how many milk 
	You will have the user enter in how many soda
	You will have the user enter in how many bread
	You will have the user enter in how many water
	You will create formula for totalMilk, totalSoda, totalBread and totalWater
	You will calculate the total of the groceries and display in correct money format
*/
}
}
