import java.util.Scanner;
public class Circle{
public static double areaCircle(int a){
double s=3.14*a*a;
return s;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
System.out.println(areaCircle(a));

}
}