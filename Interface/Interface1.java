public interface Interface1{
public abstract void m1();

}
  interface Child1 extends Interface1{
public abstract void m2();
}
class Driver implements Child1{
public void m2(){
System.out.println("2");

}
public void m1(){
System.out.println("1");

}

public static void main(String[] args){
Child1 f=new Driver();
f.m2();
}



}