public class Shape{
}
class Circle1 extends Shape{
int radius;
Circle1(int radius){
this.radius=radius;
}
public String toString(){
return "radius"+radius;
}
}
class Rectangle1 extends Shape{
int length;
int breadth;
Rectangle1(int a,int b){
length=a;
breadth=b;
}
public String toString(){
return "length"+  length  + "\n"+ " breadth   " + nbreadth   ;
}
}
class Driver1{
public static void main(String[] args){
Circle1 c=new Circle1(5);
Rectangle1 r=new Rectangle1(5,2);
System.out.println(c.toString());
System.out.println(r.toString());
}
}