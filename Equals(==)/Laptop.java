public class  Laptop{
int ram;
int rom;
int processorSpeed;
Laptop(int a,int b,int c){
ram=a;
rom=b;
processorSpeed=c;
}
public String toString(){
return "ram"+ram +"\n"+ "rom"+rom+"\n"+"processorSpeed"+processorSpeed+"\n";
}
public boolean equals(Object o){
Laptop l=(Laptop)o;
if(this.ram==l.ram && this.rom==l.rom && this.processorSpeed==l.processorSpeed)
return true;
else
return false;

}
}
class Driver3{
public static void main(String[] args){
Laptop l1=new Laptop(4,2,8);
System.out.print(l1.toString());
Laptop l2=new Laptop(4,2,5);
System.out.println(l1.equals(l2));
}
}