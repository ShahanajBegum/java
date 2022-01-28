public class ArmStrongNumber 
{   public static int Armcount(int num)
   { int count=0;
       do
       { count++;
	     num=num/10;
       }
       while (num>0);
	   
	   return count;
   }
   public static int square(int r,int n){
	   int s=1;
	   for (int i=1;i<=n ; i++)
	   {  s=s*r;
	   }
	   
	   return s;
   }
   public static boolean armstrong(int a){
	   int count=Armcount(a);
           int c=a,sum=0;
      do
      { int r=a%10;
	    sum =sum+square(r,count);
		a=a/10;
      }
      while (a>0);
	  return sum==c;
   }
	public static void main(String[] args) 
	{
		if(armstrong(153))
			System.out.println("is Arm strong");
		else
			System.out.println("is not Arm strong");
	}
}