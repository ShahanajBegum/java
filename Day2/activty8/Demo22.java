import java.util.Scanner;
public class Demo22{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int m=sc.nextInt();
int n=sc.nextInt();

for(int i=m;i<=n;i++)
{

if(i%3==0 && i%5==0)
System.out.println(i);
}
}
}