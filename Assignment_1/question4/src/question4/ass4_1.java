package question4;

public class ass4_1 {

	public static void main(String[] args)
	{
		int n = 5 ;
		
		for(int row = 0 ; row < n  ; row++) 
		{
			
			int spaces = n - row-1 ;
			 for(int s = 0  ; s < spaces ; s++  )
			{
				System.out.print(" ");
			}
			
			for(int col = 0 ; col <= row ; col ++)
			{
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
