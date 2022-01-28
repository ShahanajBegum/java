public class NonStatic{
public  void add(){
System.out.println("add()");
}
public  void add(int a){
System.out.println("add(int a)");
}
public  void add(int a,float b){
System.out.println("add(int a,float b)");
}

public  void add(int a,int b){
System.out.println("add(a,b)");
}
}

class Child1 extends NonStatic{

public static void main(String[] args){
Child1 c=new Child1();
c.add();
c.add(10);
c.add(5,10);
c.add(5,10f);
c.add(5,5);
c.add('A');
}
}
