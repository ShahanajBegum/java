public class A05{
static void demo(){
System.out.println("default");
}
}
class B05 extends A05{
protected static void demo(){
System.out.println("protected");
}
}
class C05 extends B05{
public static void demo(){
System.out.println("public");
}
}
class Driver05{
public static void main(String[] args){
C05 c5=new  C05();
c5.demo();

}
}