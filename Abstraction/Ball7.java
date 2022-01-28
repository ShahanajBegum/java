abstract class Ball7{
 private double radius;
 public void setRadius(double r){
radius=r;
}

public double getRadius(){
return radius;
}
public abstract void showGame();
}

class BasketBall extends Ball7{
String game="Basket Ball";
public void showGame(){
 
System.out.println("you can play"+game+" game");
}

}


class TennisBall extends Ball7{
String game="Tennis Ball";
public void showGame(){
 
System.out.println("you can play"+game+" game");
}

}  


class Bag7 {
Ball7 b;
public void addBall(Ball7 b){
this.b=b;
System.out.println("ball is added");
}

public void removeBall(){
b=null;
System.out.println("ball is removed");
}

public void isEmpty(){
 if(b==null)
System.out.println("Bag Is Empty");
else 
System.out.println("Bag Is Not Empty");
}

public void showGame7(){ 


 
b.showGame();

}
}