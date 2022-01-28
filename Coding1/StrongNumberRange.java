class  StrongNumberRange
{    public static int fact(int r){
		int f=1;
    for(int i=2;i<=r;i++){
       f=f*i;
		
	}
	return f;
								   
	}
  public static boolean Strong(int num)
	{
	  int s=num;int g=0;
       for (int i=num;i>0 ; )
       {     int r=i%10;
  
      g= g+ fact(r);
	  
	i= i/10;
     }
 
     return g==s;

  }

	public static void main(String[] args) 
	{  
		for (int i=1;i<=500 ; i++)
	     {
		if(Strong(i))
			System.out.println(i);
	 
	      }
		
	}	
}