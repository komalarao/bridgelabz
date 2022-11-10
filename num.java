package forsum;

import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		int in;
		int no;
		int total=0;
		Scanner f= new Scanner(System.in);
		System.out.println("Enter a number: ");
		in= f.nextInt();
		for(no=0;no<=in;no++) {
			total=total+no;
		}
			
        System.out.println("total sum of natural numbers upto given number:"+total);
	}

}
