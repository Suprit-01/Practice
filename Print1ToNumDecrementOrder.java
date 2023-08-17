package ForLoop;

import java.util.Scanner;

public class Print1ToNumDecrementOrder {
	public static void main(String[] args) {
		
		System.out.println("Enter a number ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		System.out.println("In decrementing order");
		for(int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
		
		
	}

}
