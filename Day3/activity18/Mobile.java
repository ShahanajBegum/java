public class Mobile{
Sim s;
String model;
int price;

void getMobileDetails(){
System.out.println("model"+" " +model);
System.out.println("model"+" " +price);
}
void insertSim(){
s=new Sim();
System.out.println("insert sim");
}
void removeSim(){
s=null;
System.out.println("remove sim");
}
public static void main(String[] args){
Mobile m=new Mobile();
m.model="oppo f5";
m.price=20000;
m.insertSim();
m.s.serviceprovider="idea";
m.getMobileDetails();
m.s.getSimDetails();
System.out.println(m.s.getSimNo());
System.out.println(m.s.serviceprovider);
m.removeSim();
}
}