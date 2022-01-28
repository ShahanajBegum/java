class Fruit{
String color="red";
}
class Vegetable extends Fruit {
String color="green";
}
class Driver {
public static void main(String[] args){
Fruit f=new Fruit();
Vegetable v=new Vegetable();

Fruit f1=new Vegetable();
Vegetable v1=(Vegetable)f1;



}


}