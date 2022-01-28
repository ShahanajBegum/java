public class Parent{
int a=1;
int b=2;
public static void temp(){
System.out.println("temp");
}
public  void temp1(){
System.out.println("temp");
}
}
class Child extends Parent{
int c=3;
int d=4;
public static void main(String[] args){
Child c=new Child();
Parent p= new Parent();
if(p instanceOf Parent){
Parent p1=p;
}
//if(p instanceOf Child ){
//Child c1=(Child)p;
}
if(c instanceOf Child ){
Child c2=c;
}
if(c instanceOf Parent ){
Parent p1=c;
}
}

}