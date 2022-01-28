public class  Static_NonStatic{
public  void add(){
System.out.println("add()");
}
public static void add(int a){
System.out.println("add(int a)");
}
public  void add(int a,float b){
System.out.println("add(int a,float b)");
}

public static void add(int a,int b){
System.out.println("add(a,b)");
}
}

class Child2 extends Static_NonStatic{

public static void main(String[] args){
Child2 c=new Child2();
c.add();
c.add(10);
c.add(5,10);
c.add(5,10f);
c.add(5,5);
c.add('A');
}
}
