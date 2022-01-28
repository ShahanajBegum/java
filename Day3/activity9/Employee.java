public class Employee{
int eid;
String name;
int salary;
void toSetAttributes(int eid, String name,int salary){
 this.eid=eid;
 this.name=name;
 this.salary=salary;
 
}
void toPrintAttributes(){

  System.out.println(eid);
  System.out.println(name);
  System.out.println(salary);
  System.out.println(this);
  

}
public static void main(String[] args){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();

e1.toSetAttributes(1,"shahanaj",25000);
e2.toSetAttributes(2,"ameer",20000);
e3.toSetAttributes(3,"syed",18000);
e1.toPrintAttributes();
e2.toPrintAttributes();
e3.toPrintAttributes();


}

}