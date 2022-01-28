import java.util.Scanner;
public  abstract class Ola{
String Customer_name;
long Contact_no;
abstract public void bookRide();
}

class Auto extends Ola{
String source;
String destination;
int time;
double distance;
public void bookRide(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the source");
source=sc.nextLine();
System.out.println("enter the destination");
destination= sc.nextLine();
System.out.println("enter the  time");
time=sc.nextInt();
System.out.println("enter the distance");
distance=sc.nextDouble();
double total=distance*16;
double total_amount=total*1.1;
System.out.println("thankyou for booking ride");
}
}
class Mini extends Ola{
String source;
String destination;
int time;
double distance;
public void bookRide(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the source");
source=sc.nextLine();
System.out.println("enter the destination");
destination= sc.nextLine();
System.out.println("enter the  time");
time=sc.nextInt();
System.out.println("enter the distance");
distance=sc.nextDouble();
double total=distance*18;
double total_amount=total*1.1;
System.out.println("thankyou for booking ride");
}
}

class Prime extends Ola{

String source;
String destination;
int time;
double distance;
public void bookRide(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the source");
source=sc.nextLine();
System.out.println("enter the destination");
destination= sc.nextLine();
System.out.println("enter the  time");
time=sc.nextInt();
System.out.println("enter the distance");
distance=sc.nextDouble();
double total=distance*19;
double total_amount=total*1.1;
System.out.println("thankyou for booking ride");
}
} 