package ForLoop;

import java.util.Scanner;

public class CalculateSumOfNHalfSeries {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any natural number= ");
		int n=scan.nextInt();
		scan.close();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			 sum=sum+1.0/i;
			
		}
		System.out.println("Sum of the numbers="+sum);
	}

}
