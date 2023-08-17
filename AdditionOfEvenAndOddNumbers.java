package ForLoop;

import java.util.Scanner;

public class AdditionOfEvenAndOddNumbers {
	public static void main(String[] args) {
		
		System.out.println("User please enter upto where you have calculate the sum of the Odd and Even");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sumEven=0;
		int sumOdd=0;
		scan.close();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sumEven=sumEven+i;
			}
			else
			{
				sumOdd=sumOdd+i;
			}
		}
		System.out.println("The sum of all even numbers upto "+n+" is "+sumEven);
		System.out.println("The sum of all Odd numbers upto "+n+" is "+sumOdd);

		
	}
	

}
