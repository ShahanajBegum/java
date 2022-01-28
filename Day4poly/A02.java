public class A02{
static void  demo(){
System.out.println("a");
}
}
class B02 extends A02{
static void  demo(){
System.out.println("b");
}
}
class C02 extends B02{
static void  demo(){
System.out.println("c");
}
}
class D02{
public static void main(String[] args){

A02 obj1=new A02();                       
obj1.demo();

A02 obj2=new B02();                       
obj2.demo();

A02 obj3=new A02();                       
obj3.demo();
 
B02 obj4=(B02)new A02();                       
obj4.demo();

B02 obj5=new B02();                       
obj5.demo();

B02 obj6=new C02();                       
obj6.demo();
 
C02 obj7=(C02)new A02();                       
obj7.demo();

C02 obj8=(C02)new B02();                       
obj8.demo();

C02 obj9=new C02();                       
obj9.demo();

}
}
 