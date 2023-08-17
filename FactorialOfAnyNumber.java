package ForLoop;

import java.util.Scanner;

public class FactorialOfAnyNumber {

	public static void main(String[] args) {

		System.out.println("Enter any number= ");
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Factorial of number "+n);
		int fact=1;
		scan.close();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of Number "+n+" is = "+fact);
		
		
	}

}
