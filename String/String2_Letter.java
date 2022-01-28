import java.util.Scanner;
public class String2_Letter{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a name");
String s=sc.nextLine();
for(int i=0;i<s.lenth();i++)
if(i>1 && i<s.length-2)
System.out.print("*");
else
System.out.print(s.charAt(i));

}

}