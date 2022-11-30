 
 class Pattern1{
	
	static void CrossPattern(int n){
		System.out.println("Plus pattern");
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		    	if(i ==n/2+1 || j==n/2+1 )
					
						System.out.print("* ");
			else
					System.out.print(" ");
				}
					System.out.println();
				
				}
	}
	static void PlusPattern(int n){
		System.out.println("cross pattern");
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		    	if(i == j || i+j == n+1 )
					
						System.out.print("* ");
			else
					System.out.print(" ");
				}
					System.out.println();
				
				}		
	}
	static void LeftDiagonal(int n){
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		    	if(i +j == n+1 )
					
						System.out.print("* ");
			else
					System.out.print(" ");
				}
					System.out.println();
				}
	}
	
	static void MajorDiagonal(int n){
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		    	if(i == j  )
					
						System.out.print("* ");
			else
					System.out.print(" ");
				}
					System.out.println();
				
				}
	}
	static void HorizontalLine(int n){
			
		  	  System.out.println("Harizontal line");
			
	        for(int i=1;i<n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i==j  )
					{
						System.out.print("*");
				}
				
				else{
					System.out.print("");
				   }
			}  
					System.out.println();
				
			}
	}
	
	    public static void main(String args[])
        {
            int n = 5;
			
            PlusPattern(n);
			CrossPattern( n);
			LeftDiagonal(n);
			
			HorizontalLine(n);
			MajorDiagonal(n);
        }
    }
	

