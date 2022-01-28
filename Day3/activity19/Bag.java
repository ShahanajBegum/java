import java.util.Scanner;
public class Bag1{
Ball b;
public void addBall(Ball b){
this.b=b;
}
public void removeBag(){
b=null;
System.out.println("remove ball");
}
public void isBagEmpty(){
if(b!=null)
System.out.println("bag is not empty");
else if(b==null)
System.out.println("  bag is empty");
}
public void showGame(){
if(b instanceof Basketball){
BasketBall bb=(BasketBall)b;
System.out.println("show game that can be played"+bb.game+"ball game")
}
else{
TennisBall bt=(TennisBall)b;
System.out.println("show game that can be played"+bt.game+"ball game");
}
}
class Driver7{
public Static void main(String[] args){
Scanner sc=new Scanner(System.in);
Bag1 bag=new Bag1();
boolean flag=true;
do{
System.out.println("===============================");
System.out.println("1--Add Ball");
System.out.println("2--	Remove Ball");
System.out.println("3--isBagEmpty");
System.out.println("4--showGame");
System.out.println("5--showGame");
System.out.println("please enter ur choice");
System.out.println("+++++++++++++++++++");
int a=sc.nextInt();
switch(a){
case 1:
       System.out.println("a.Basket ball");
       System.out.println("b.Basket ball");
       System.out.println("enter ur choice");
       int c=sc.nextInt();
       switch(c){
       case 1: ba.addBall(new BasketBall());
               System.out.println("basketball is successfully played");
       case 2: ba.addBall(new TennisBall());
               System.out.println("tennisball is successfully played");
        }
       break;
case 2: 
        bag.removeBall();
        System.out.println("ball is successfully removed");
        break;
case 3: 
        bag.isBagEmpty();
        break;
case 4:
        bag.showGame();
        break;
case 5: flag=false;

       }
}while(flag);
}

}

