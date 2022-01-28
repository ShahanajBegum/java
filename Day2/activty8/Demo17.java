import java.util.Scanner;
public class Demo17{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int m=sc.nextInt();
int n=sc.nextInt();
for(int i=m;i<=n;i++){
if(i%2==1)
System.out.println(i);
}
}
}