import java.util.Scanner;
public class FactorialEvenDigit{
public static int isFactorial(int n){
int f=1;
while(n>0){
int r=n%10;
//int f=1;
while(r>1){
if(r%2==0){
f=f*r;
r--;
}
}
}
return f;

}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int a=isFactorial(n);
System.out.println(a);

}
}