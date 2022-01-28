import java.util.Scanner;
public class Demo7{
public static void display(int a,int b,int c){
if(a>b && a>c)
System.out.println("a is big" +a);
else if(b>c)
System.out.println("b is big"  +b);
else
System.out.println("C is big"  +c);


}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
display(a,b,c);

}




}