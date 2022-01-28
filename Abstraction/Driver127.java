import java.util.Scanner;
class Driver127{
public static void main(String []args){
Bag7 ba= new Bag7();
boolean falg=true;
Scanner sc=new Scanner(System.in);
do{
System.out.println("************");
System.out.println("1.Add Ball");
System.out.println("2.Remove  Ball");
System.out.println("3.check bag is empty");
System.out.println("4.show game that can be played");
System.out.println("5.exit");
System.out.println("enter the choice");
System.out.println("************");
int f=sc.nextInt();
switch(f){
case 1:{
         System.out.println("enter the which ball to add");
         System.out.println("a.Basket Ball");
         System.out.println("b.tennis Ball");
        char c=sc.next().charAt(0);
     if(c=='a'){
     ba.addBall(new BasketBall());
       }
      else if(c=='b'){
      ba.addBall(new TennisBall());
     }
}
break;
case 2: ba.removeBall();
break;
case 3:ba.isEmpty();
break;
case 4:ba.showGame7();
break;
case 5:falg=false;
}
}while(falg);
}}