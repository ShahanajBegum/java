public class MultiInheritance{
int a;
int b=1;
}
 class Child3 extends MultiInheritance{
int c=3;
int d=4;
}
 
 class Child4 extends Child3{
int e=5;
public static void main(String[] args){
Child4 c4=new Child4();
System.out.println(c4.a);
System.out.println(c4.b);
System.out.println(c4.c);
System.out.println(c4.d);
System.out.println(c4.e);

}
}