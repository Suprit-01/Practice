package ForLoop;

import java.util.Scanner;

public class PrintingMultipleTable {
	public static void main(String[] args) {
		
		System.out.println("Enter which table to written= ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}

}
