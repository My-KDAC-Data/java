package assignment01;

import java.util.*;

public class number_prog {

	public static void main(String[] args) {
		int num ;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter number");
		num = obj.nextInt();
		
		System.out.println(" Given Number " + num) ;  
		
		String binaryEquivalent = Integer.toBinaryString(num); // wrapper classes string to int(binary)
		String octalEquivalent = Integer.toOctalString(num);   // wrapper classes string to int(octal)
		String hexadecimalEquivalent = Integer.toHexString(num); // wrapper classes string to int(hexadecimal)
		System.out.println(" Binary equivalent = "+ binaryEquivalent);
		System.out.println(" Octal equivalent = "+ octalEquivalent);
		System.out.println(" Hexadecimal equivalent = "+ hexadecimalEquivalent );

	}

}
