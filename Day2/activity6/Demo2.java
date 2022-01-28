import java.util.Scanner;
public class Demo2{
public static void display(int a, int b){
int res=a+b;
System.out.println(res);
return;
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
int b=sc.nextInt();
display(a,b);
}

}

