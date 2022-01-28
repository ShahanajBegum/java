import java.util.Scanner;
public class Demo9{
public static void display(int n){
if(((n%4==0 )&&( n%100!=0))||(n%400==0))
System.out.println("leap year");
else
System.out.println(" not leap year");


}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a year");
int n=sc.nextInt();
display(n);

}
}