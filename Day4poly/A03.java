public class A03{
public static void  demo(){
System.out.println("a");
}
}
 class B03 extends A03{
static void  demo1(){
System.out.println("b");
}
}
 class C03 extends B03{
static void  demo2(){
System.out.println("c");
}
}
class D03{
public static void main(String[] args){

A03 obj1=new A03();                       
obj1.demo();
 
A03 obj2=new B03();
obj2.demo();
//obj2.demo1();

A03 obj3=new C03();
obj3.demo();
//obj3.demo1();
//obj3.demo2();
 
B03 obj4=(B03)new A03();                       
obj4.demo();
 
B03 obj5=new B03();
obj5.demo();
obj5.demo1();

B03 obj6=new C03();
obj6.demo();
obj6.demo1();
//obj6.demo2();
 

 
C03 obj7=(C03)new A03();                       
obj7.demo();


 
C03 obj8=(C03)new B03();                       
obj8.demo();
obj8.demo1();
 
C03 obj9=new C03();
obj9.demo();
obj9.demo1();
obj9.demo2();


}
}