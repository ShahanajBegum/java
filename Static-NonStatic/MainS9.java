public class MainS9{
int a;
int b=20;
static{
int c=20;
}
public static void demo(){
int d=40;
System.out.println(a);

}
public static void main(String[] args){

System.out.println(a);
MainS9 m=new MainS9();
System.out.println(m.a);
System.out.println(m.b);
System.out.println(m.c);
m.demo();

}


}