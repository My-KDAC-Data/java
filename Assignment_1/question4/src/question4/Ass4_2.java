package question4;

public class Ass4_2 {

	public static void main(String[] args) 
	{ 
		int n = 5;
	
		for(int i =0; i<n; i++)
		{
			int spaces = n - i -1;
			
			for(int s=0; s<spaces; s++ )
			{
				System.out.print(" ");
			}
			
			for(int j = 0;j < 2 * i + 1;j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
		
//		for(int k = 4 ; k > n; k--)
//		{
//			int space = n - k ;
//			
//			for(int s=0; s<space; s++ )
//			{
//				System.out.print("#");
//			} 
//			System.out.println();
		
		for(int k = 1 ; k <= 4; k++)
		{
			for(int j = 1 ; j <= k ; j++)
			{
				System.out.print(" ");
			}
			
			for(int r = 4 ; r >= k ; r--)
			{
				System.out.print("*");
			}
			
			for(int l = 3 ; l >= k  ; l--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
			
		}
	

}


