public class Car{
Enginee1 e1=new Enginee1();
String model;
int price;
String color;
 void getCarDetails(){

System.out.println("model"+"  " +model);
System.out.println("price"+"  " +price);
System.out.println("color"+"  " +color);
}
Car(Enginee1 e1){
this.model=model;
this.price=price;
System.out.println("my car");

}
public static void main(String[] args){
Car c=new Car(new Enginee1());
c.model="bmw";
c.price=500000;
c.color="black";
System.out.println(c.e1.getEngine());
System.out.println(c.e1.getCc());
c.getCarDetails();
}
}