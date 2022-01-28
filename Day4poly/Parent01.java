public class Parent01{
int a=10;
static int b=20;
}
class Child01 extends Parent01{
int c=30;
int d=40;
}
class Driver01{
public static void main(String[] args){
Parent01 p=new Parent01();//only parent members
System.out.println(p.a);
System.out.println(p.b);

Child01 c1=new Child01();//both members of parent and child
System.out.println(c1.a);
System.out.println(c1.b);
System.out.println(c1.c);
System.out.println(c1.d);

Parent01 c2=new Child01();//members of parent only
System.out.println(c2.a);
System.out.println(c2.b);
 
//Parent01 p2=new Child01();upcast
//Child01 c3= (Child01)p2;//downcast

Child01 c3=(Child01) new Parent01();//class cast exception
System.out.println(c3.a);
System.out.println(c3.b);

}

}