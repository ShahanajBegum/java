public class A01{
int a=10;
 int b=20;
}
class B01 extends A01{
int a=30;
int b=40;
}
class C01 extends B01{
int a=50;
int b=60;
}
class D01{
public static void main(String[] args){

A01 obj1=new A01();                       
System.out.println(obj1.a);
System.out.println(obj1.b);

A01 obj2=new B01();                       
System.out.println(obj2.a);
System.out.println(obj2.b);

A01 obj3=new A01();                       
System.out.println(obj3.a);
System.out.println(obj3.b);
 
B01 obj4=(B01)new A01();                       
System.out.println(obj4.a);
System.out.println(obj4.b);

B01 obj5=new B01();                       
System.out.println(obj5.a);
System.out.println(obj5.b);

B01 obj6=new C01();                       
System.out.println(obj6.a);
System.out.println(obj6.b);
 
C01 obj7=(C01)new A01();                       
System.out.println(obj7.a);
System.out.println(obj7.b);

C01 obj8=(C01)new B01();                       
System.out.println(obj8.a);
System.out.println(obj8.b);

C01 obj9=new C01();                       
System.out.println(obj9.a);
System.out.println(obj9.b);

}
}
 