public class Laptop{
  String name;
  int price;
  String color;
public static void main(String[] args){
Laptop l1=new Laptop();
Laptop l2=new Laptop();
Laptop l3=new Laptop();

l1.name="Dell";
l1.price=49500;
l1.color="silver";
l2.name="mac";
l2.price=950000;
l2.color="black";
l3.name="hp";
l3.price=45000;
l3.color="white";

System.out.println(l1.name  +"            " +  l1.price  +" " +  l1.color);
System.out.println(l2.name  +"            " +  l2.price  +" " +  l2.color);
System.out.println(l3.name  +"            " +  l3.price  +" " +  l3.color);
}

}