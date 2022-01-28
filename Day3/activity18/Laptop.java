public class Laptop{
Processor p=new Processor();
String brand;
int mrp;

void displayAttributes(){
System.out.println("brand"+" " +brand);
System.out.println("mrp"+""+mrp);
}

public static void main(String[] args){
Laptop l=new Laptop();
l.brand="dell";
l.mrp=500000;
l.p.speed="8gb";
l.p.generation="i5";
l.p.displayAttributes();
l.displayAttributes();


}



}