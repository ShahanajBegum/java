import java.util.Scanner;
public class String1_concate{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a name");
String s=sc.nextLine().trim().toUpperCase();
String l=sc.nextLine().trim().toUpperCase();
s.concat(l);
System.out.println(s.concat("  "+l));

}

}