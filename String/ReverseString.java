import java.util.Scanner;
public class ReverseString{
public static void main(String[] args){
String rev="";
Scanner sc=new Scanner(System.in);
System.out.println("enter a name");
String s= sc.nextLine();
int length=s.length();
for(int i=length-1;i>=0;i--){
rev=rev+s.charAt(i);

}
System.out.println(rev);


}
}