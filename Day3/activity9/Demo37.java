public class Demo37{
public static void main(String[] args){
System.out.println("main method a starts");
B.m1();
System.out.println("main method a ends");
}
}
class B{
public static void main(String[] args){
System.out.println("main method of b is executing");
}
public static void m1(){
System.out.println("main method of b1() is executing");
}

}