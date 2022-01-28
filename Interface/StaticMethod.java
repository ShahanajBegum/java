public interface StaticMethod{
  int a=10;
public static void m1(){
System.out.println("m1");
}
public static void main(String[] args){
System.out.println(a);
}
}

class A implements StaticMethod{
public static void m1(){
System.out.println("m1=1");

}

public static void main(String[] args){
StaticMethod a= new A();
a.m1();


}

}