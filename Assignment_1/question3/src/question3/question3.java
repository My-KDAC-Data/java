package question3;
import java.util.*;

/*  Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.    */

public class question3 {

	public static void main(String[] args) {
		
		int choice ,sum = 0 ;
		int Qty ;
		Scanner sc = new Scanner(System.in);

		
	  do
		{
		System.out.println("select the item ");
		System.out.println("0.EXIT");
		System.out.println("1.Dosa     RS 100 /-");
		System.out.println("2.Samosa RS 50 /-");
		System.out.println("3.Idli RS 60 /-");
		System.out.println("4.PBM  RS 300 /-");
		System.out.println("5.TR RS 30 /- ");
		System.out.println("6.B NAAN RS 80 /-");
		System.out.println("7.RICE RS 200 /-");
		System.out.println("8.BIRYANI RS 350 /-");
		System.out.println("9.SIZZLER RS 500 /-");
		System.out.println("10.Generate bill ");
		
		
		
		System.out.println("Enter the Choice ");
		choice = sc.nextInt();

		switch(choice) {
		case 1 :
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 100) * Qty ;
					
					break ;
					
		case 2 :
			
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 50) * Qty ;
					
					break ;		
					
					
		case 3 :
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 60) * Qty ;
			break ;	
			
		case 4 :
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 300) * Qty ;
			break ;	
			
		case 5 :
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 30) * Qty ;
			break ;	
			
		case 6 :
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 80) * Qty ;
			break ;	
			
			
		case 7 :
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 200) * Qty ;
			break ;	
			
		case 8 :
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 350) * Qty ;
			break ;	
			
			
		case 9 :
			System.out.println("Enter the quantity ");
			Qty = sc.nextInt();
			
			sum = (sum + 500) * Qty ;
			break ;	
			
		case 10 :
			
			System.out.println("Total Amount is = " + sum);
			break ;
			
		    
			}
		}while(choice!=0);
		
	
		
		
	
		
		sc.close();
	}				
				

	}

