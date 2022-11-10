package flipnumfor;
import java.util.*;
public class RevNum {

	public static void main(String[] args) {
        int rev;
        int output=0;
        Scanner num = new Scanner(System.in);
        System.out.println("please allot a number:");
        rev = num.nextInt();
        for(;rev!=0;rev=rev/10) {
        	var digit = rev%10;
        	output = (output*10)+ digit;
        	
        }
        System.out.println("reverse of the given number using for loop:"+output);
	}

}
