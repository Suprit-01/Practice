package ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();

		scan.close();
		int sum=0;
		
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of "+num+" natural numbers= "+sum);
	
		
	}

}
