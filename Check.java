package palindrome;
import java.util.*;
public class Check {

	public static void main(String[] args) {
        int num,digit,temp,output=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please allot a number:");
         num = sc.nextInt();
        temp=num;
        for(output=0;temp>0;temp=temp/10) {
        	 digit = temp%10;
        	output = (output*10)+ digit;
        	
        }
        //System.out.println("reverse of the given number using for loop:"+output);
        if (num==output) {
        	System.out.println("this is a palindrome number:");
        }else {
        	System.out.println("this is not a palindrome number:");
        }
	  

	}

}
