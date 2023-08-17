package ForLoop;

import java.util.Scanner;

public class PowerOfAnotherNumber {

	public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
       System.out.println("Enter Any Base positive Number=");
       int n=scan.nextInt();
       System.out.println("Enter any positive number for Power=");
       int power=scan.nextInt();
      int  res=1;
      scan.close();
       for(int i=1;i<=power;i++)
       {
    	   res=res*n;
       }
      System.out.println("The "+n+" power of "+power+" = "+res);
       
       

	}

}
