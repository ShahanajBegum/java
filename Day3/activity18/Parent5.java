public class Parent5{
int p=10;
}
 class Child5 extends Parent5{
int c=5;
}
 class Driver5{
public static void main(String[] args){
Child5 d=new Child5();
System.out.println(d.p);
System.out.println(d.c);
Parent5 p1=(Parent5)d;
System.out.println(p1.p);
//System.out.println(p1.c);
}
} 