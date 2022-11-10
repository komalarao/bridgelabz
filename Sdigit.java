package numbers;
import java.util.*;
public class Sdigit {

	public static void main(String[] args) {
	   int n;
	   Scanner a= new Scanner(System.in);
	   System.out.println("enter a single digit number:");
	   n=a.nextInt();
	   if(n==0) {
		   System.out.println("given number in word is :zero");
	   }else if(n==1) {
		   System.out.println("given number in word is  :one");
	   }else if(n==2) {
		   System.out.println("given number in word is  :two");
	   }else if(n==3) {
		   System.out.println("given number in word is  :three");
	   }else if(n==4) {
		   System.out.println("given number in word is :four");
	   }else if(n==5) {
		   System.out.println(" given number in word is :five");
	   }else if(n==6) {
		   System.out.println("given number in word is  :six");
	   }else if(n==7) {
		   System.out.println("given number in word is  :seven");
	   }else if(n==8) {
		   System.out.println("given number in word is  :eight");
	   }else {
		   System.out.println("given number in word is  :nine");
	   }

	}

}
