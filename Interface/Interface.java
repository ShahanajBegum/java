public interface Interface{
public abstract void m2();

}
  class Child implements Interface{
public  void m2(){
System.out.println("m2");

}
public static void main(String[] args){
Interface f=new Child();
f.m2();
}



}