package denomination;
import java.util.Scanner;
public class Places {

	public static void main(String[] args) {
		int unit;
		Scanner deno = new Scanner(System.in);
		System.out.println("enter a number less than 1000:");
		unit = deno.nextInt();
		if (unit==1) {
			System.out.println("unit:");
		}else if (unit==10) {
			System.out.println("ten");
			
		}else if (unit==100) {
			System.out.println("hundred");
		}else if (unit==1000) {
			System.out.println("thousand");
		}else {
			System.out.println("this number is not in valid parameters:");
		}
		

	}

}
