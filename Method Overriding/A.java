public class A{

Object test(){
System.out.println("A");
return new Object();

}
}

class B extends A{
protected String test(){
System.out.println("B");
return "ee";
}
}

class C extends B{
public  String test(){
System.out.println("C");
return "ere";
}
}

class Driver2{
public static void main(String[] args){
A a1= new A();
System.out.println(a1.test());
A a2= new B();
System.out.println(a2.test());
A a3= new C();
System.out.println(a3.test());

B b1=new B();
System.out.println(b1.test());
B b2=new C();
System.out.println(b2.test());

C c1=new C();
System.out.println(c1.test());

}

}