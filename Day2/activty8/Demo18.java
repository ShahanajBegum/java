import java.util.Scanner;
public class Demo18{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int m=sc.nextInt();
int n=sc.nextInt();
int count=0;
for(int i=m;i<=n;i++)
{

count++;


}
System.out.println(count);
}
}