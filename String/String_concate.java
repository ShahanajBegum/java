import java.util.Scanner;
public class String_concate{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a name");
String s=sc.nextLine();
String l=sc.nextLine();
s.concat(l);
System.out.println(s.concat(l));

}

}