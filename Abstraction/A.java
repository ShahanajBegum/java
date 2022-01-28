 public abstract class A{
protected  abstract void m1();
}


 class B extends A{
void m1(){
System.out.println("one");

}
}
class Test{
public static void main(String[] args){

B b=new B();
b.m1();
}

}