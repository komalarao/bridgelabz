package integer;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		int x;
		Scanner a=new Scanner(System.in);
		System.out.println("please enter an integer number:");
		 x = a.nextInt();
		var remainder = 0;
		while(x > 0)
		{
		    var digit = x % 10;
		    remainder = (remainder * 10) + digit;
		    x = (x / 10);
		}
		System.out.println("reverse of the number is =" + remainder);

	}

}
