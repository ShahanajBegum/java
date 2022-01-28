public class Parent02{
int a=10;
static int b=20;
}
class Child02 extends Parent02{
int a=30;
int d=40;
}
class Driver02{
public static void main(String[] args){
Parent02 p=new Parent02();//only parent members
System.out.println(p.a);//10
System.out.println(p.b);//20

Child02 c1=new Child02();//both members of parent and child
System.out.println(c1.a);//10
System.out.println(c1.b);//20
System.out.println(c1.a);//10
System.out.println(c1.d);//40

Parent02 c2=new Child02();//members of parent only
System.out.println(c2.a);//10
System.out.println(c2.b);//20
 
//Parent02 p2=new Child02();upcast
//Child02 c3= (Child02)p2;//downcast

Child02 c3=(Child02) new Parent02();//class cast exception
System.out.println(c3.a);
System.out.println(c3.b);

}

}