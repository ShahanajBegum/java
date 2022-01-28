public class A3{
public void demo(){
System.out.println("demo()");
}

}
interface B3{

public void demo();
}
class C3 extends A3 implements B3{

}
class Driver{
public static void main(String[] args){
C3 c1=new C3();
//A3 a1=(A3)new B3();
B3 b1=(B3)new A3();

//C c2=(C)new B();
//C C3=(C)new A();
}
}