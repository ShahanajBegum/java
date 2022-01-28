public class Pen{
  String brand;
  String color;
  int price;
public static void main(String[] args){
Pen p1=new Pen();
Pen p2=new Pen();
Pen p3=new Pen();
p1.brand="cello";
p1.color="blue";
p1.price=5;
p2.brand="rorito fyro";
p2.color="black";
p2.price=10;
p3.brand="elkos";
p3.color="red";
p3.price=25;
System.out.println(p1.brand  +"            " +  p1.color + " " +p1.price);
System.out.println(p2.brand  +"            " +  p2.color + " " +p2.price);
System.out.println(p3.brand  +"            " +  p3.color + " " +p3.price);
}

}