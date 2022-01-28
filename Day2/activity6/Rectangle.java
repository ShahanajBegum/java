import java.util.Scanner;
public class Rectangle{
public static int areaRec(int l, int b){
int s=l*b;
return s;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int l=sc.nextInt();
int b=sc.nextInt();
System.out.println(areaRec(l,b));

}
}