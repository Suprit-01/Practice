package ForLoop;

import java.util.Scanner;

public class Print1To10IncrementOrder {

	public static void main(String[] args) {

		System.out.println("Enter number upto where to print");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("Start from printing from 1 To "+num);
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
		scan.close();
		
	}

}
