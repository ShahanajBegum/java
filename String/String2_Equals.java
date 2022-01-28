import java.util.Scanner;
public class String2_Equals{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter A city");
String s=sc.nextLine();
System.out.println("enter B name");
String n=sc.nextLine();
System.out.println(s.equals(n));
System.out.println(s.equalsIgnoreCase(n));

}

}