import java.util.Scanner;
public class Demo8{
public static void display(char ch){
if(ch>='A'&& ch<='Z')
System.out.println("upper case");
else if(ch>='a'&& ch<='z')
System.out.println("lowercase");
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
char ch=sc.next().charAt(0);
display(ch);
}
}