package com.qa.main;

import java.util.Scanner;

public class Division {
	
	public void division () throws MyExcep{
		Scanner scan = new Scanner(System.in);
			int n1=0;
			int n2 =0;
			try {
				System.out.println("enter a number: ");
				n1 = Integer.parseInt(scan.nextLine());
				System.out.println("enter a number again: ");
				n2 = Integer.parseInt(scan.nextLine());
				if (n1<n2)
					throw new MyExcep();
				System.out.println(n1/n2);
			}catch (NumberFormatException nfe) {
				System.out.println("not number ");
			}catch (ArithmeticException ae) {
				System.out.println("what you doing?");
			}catch (Exception e) {
				System.out.println("why");
			}
			finally {
				scan.close();
			}
	}
}
		