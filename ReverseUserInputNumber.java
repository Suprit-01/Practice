package ForLoop;

import java.util.Scanner;

public class ReverseUserInputNumber {
	public static void main(String[] args) {
		System.out.println("Enter any number of positive digits = ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int rem,reverse=0;
		scan.close();
		while(num!=0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println("The reversed number is ="+reverse);
		
		
	}

}
