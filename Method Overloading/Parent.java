public class Parent{
public static void add(){
System.out.println("add()");
}
public static void add(int a){
System.out.println("add(int a)");
}
public static void add(int a,float b){
System.out.println("add(int a,float b)");
}

public static void add(int a,int b){
System.out.println("add(a,b)");
}
}

class Child extends Parent{

public static void main(String[] args){
add();
add(10);
add(5,10);
add(5,10f);
add(5,5);
add('A');
}
}
