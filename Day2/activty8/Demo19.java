import java.util.Scanner;
public class Demo19{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int m=sc.nextInt();
int n=sc.nextInt();
int sum=0;
for(int i=m;i<=n;i++)
{
sum=sum+i;


}
System.out.println(sum);
}
}