public class MainS10{
int a;
static int b=20;

public  void demo(){
System.out.println("demo");
}

public  void demo1(){
System.out.println("demo1");
}

public static void temp(){
System.out.println("temp");
}

public static void main(String[] args){
MainS10 m=new MainS10();
System.out.println(b);
System.out.println(a);
demo();
demo1();
temp();

m.demo();
m.demo1();
m.temp();

}


}