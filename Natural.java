package sum;
import java.util.*;
public class Natural {

	public static void main(String[] args) {
	   int addition;
	   int n=0;
	   int Sum=0;
	   Scanner add= new Scanner(System.in);
	   System.out.println("enter any number:");
	   addition= add.nextInt();
	   while(n<=addition) {
		   Sum=Sum+n;
		   n++;
	   }
       System.out.println("sum of natural numbers of the given entered number is :"+Sum);
	}

}
