package ForLoop;

import java.util.Scanner;

public class UserInputPrimeNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any positive number");
		int num=scan.nextInt();
		if(isPrime(num))
		{
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println(num+" is Not prime number");
		}
		
		
	}

	public static boolean isPrime(int num) {

		if(num<2)
		{
			System.out.println("Its not prime");
			System.exit(0);
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
