
public class OutputDemo1 {
	public static void main(String[] args)
	{
		int num1=7;
		int num2=2;
		String name= "Mary";
		//using the newline escape characters \n and \t
		
		System.out.println("Hello "+name+", \nYour favorite number is "+num1);
		System.out.println("Sum is "+(num1+num2));
		System.out.println("Difference is "+(num1-num2));
		//creating a formula for a variable's value
		int product= num1*num2;
		//use a \t to act as a tab in your string literal
		System.out.println("Product is\t"+product);
	}

}
