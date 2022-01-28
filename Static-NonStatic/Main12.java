public class MainS12{
int a;
static string name;
static{
System.out.println("static");
int c=40;
}
{
c=c*a;
System.out.println(c);
}
static{
MainS12 d= new MainS12();
d.a=20;
d.name="rama";
}
{
System.out.println(a);
System.out.println(name);
}
c=test();
public static int test(){
System.out.println("test()");
return 40;
}

{
a=c=50;
c=a+10;
System.out.println(c);
System.out.println(name);
}
public static void main(String[] args){
MainS12 d=new MainS12();
System.out.println(d.a);
MainS12 d1=new MainS12();
System.out.println(d.c);
System.out.println(test());

}
}