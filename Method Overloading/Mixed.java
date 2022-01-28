public class Mixed{
public static void add(){
System.out.println("add()");
}
public  void add(int a){
System.out.println("add(int a)");
}
}

class Child3 extends Mixed{
public static void sub(){
System.out.println("sub()");
}
public  void sub(int a){
System.out.println("sub(int a)");
}
}
class Driver1{
public static void main(String[] args){
Child3 c=new Child3();
c.add();
c.add(10);
c.sub();
c.sub(10);
}
}








