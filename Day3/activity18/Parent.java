class Parent{
int a=20;
int b=30;
}
class Child extends Parent{
int a=40;
int b=50;
public void print(){
System.out.println(super.a);
System.out.println(super.b);

}
public static void main(String[] args){
Parent p=new Parent();
System.out.println(p.a);
System.out.println(p.b);
Child c=new Child();
System.out.println(c.a);
System.out.println(c.b);
c.print();
}

}