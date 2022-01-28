import java.util.Scanner;
public class Bag1{
Ball ball;
public void addBall(Ball ball){
this.ball=ball;
}
public void removeBall(){
ball=null;
System.out.println("remove ball");
}
public void isBagEmpty(){
if(ball!=null)
System.out.println("bag is not empty");
else if(ball==null)
System.out.println("  bag is empty");
}
public void showGame(){
if(ball instanceof BasketBall){
BasketBall b=(BasketBall)ball;
System.out.println("show game that can be played"+b.game+"ball game");
}
else{
TennisBall t=(TennisBall)ball;
System.out.println("show game that can be played"+t.game+"ball game");
}
}
}
class Driver7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Bag1 bag=new Bag1();
boolean flag =true;
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
case 1:{
       System.out.println("a.Basket ball");
       System.out.println("b.tennis ball");
       System.out.println("enter ur choice");
       int c=sc.nextInt();
       switch(c){
       case 1: {bag.addBall(new BasketBall());
               System.out.println("basketball is successfully played");
        break; }
       case 2: {
                   bag.addBall(new TennisBall());
                   System.out.println("tennisball is successfully played"); 
                         break;
                    }
        
           break;
             }}
case 2: {
        bag.removeBall();
        System.out.println("ball is successfully removed");
        
        break;}
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

