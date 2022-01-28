import java.util.Scanner;
public class DriverOla{

public static void main(String[] args){

Scanner s=new Scanner(System.in);
Ola o;
boolean flag=true;
System.out.println("enter customer name");
String Customer_name=s.nextLine();
System.out.println("enter customer number");
long Contact_no=s.nextLong();
do{
System.out.println("*********");
System.out.println("1.auto");
System.out.println("2.mini");
System.out.println("3.prime");
int f=s.nextInt();
switch(f){
case 1: {System.out.println("1.auto");
        System.out.println("2.mini");
        System.out.println("3.prime");
        int d=s.nextInt(); 
        if(d==1){
        System.out.println("auto is booked");
        o=new Auto();
        o.bookRide();
        }
        else if(d==2){
        System.out.println("mini is booked");
        o=new Mini();
        o.bookRide();
        }
        else if(d==3){
        System.out.println("prime is booked");
        o=new Prime();
        o.bookRide();
        }
        }
        break;
}
}while(flag);

}}