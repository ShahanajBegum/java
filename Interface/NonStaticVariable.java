public interface NonStaticMethods{
  int a=10;
public static void m1(){
System.out.println("m1");
}
public static void main(String[] args){
System.out.println(a);
}
}
class A implements StaticMethods{
public static void m1(){
System.out.println("m1=1");

}

public static void main(String[] args){
StaticMethod.m1();



}