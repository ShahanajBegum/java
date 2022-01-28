//write a java program to find  the factorpublic class FactorialNumber
import java.util.Scanner;
public class FactorialDigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int a=isFactorial(n);
System.out.println(a);
while(n>0){
int r=n%10;
System.out.println(r+isFactorial(n));
}
}
public static int isFactorial(int n){
int f=1;
//while(n>0){
//int f=1;
//int r=n%10;
while(n>=1){
f=f*n;
n--;
}
return f;
//n=n/10;
//}
//return f;

}
}