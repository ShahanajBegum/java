public class A4{
int a=10;
}
class B4 extends A4{
int b=9;
}
class C4 extends B4{
int c=8;
}
class D4 extends B4{
int d=7;
}
class Driver6{
public static void main(String[] args){
A4 obj1=new A4();
System.out.println(obj1.a);

B4 obj2=new B4();
System.out.println(obj2.a);
System.out.println(obj2.b);

oC4 obj3=new C4();
System.out.println(obj3.a);
System.out.println(obj3.b);
System.out.println(obj3.c);
D4 obj4=new D4();
}
}