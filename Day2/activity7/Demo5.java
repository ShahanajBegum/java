import java.util.Scanner;
public class Demo5{
public static void display(int n ){
if(n%5==0)
System.out.println("lucky");
}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
display(n);
}
}