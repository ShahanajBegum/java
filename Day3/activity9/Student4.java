public class Student4{
int student_id;
String name;
int age;
double percentage;
 void display_Attributes(){
System.out.println(student_id);
System.out.println(name);
System.out.println(age);
System.out.println(percentage);
}
void edit_name(String name){
this.name=name;
System.out.println(name);
}
Student4(){
this.student_id=student_id;
this.name=name;
this.age=age;
this.percentage=percentage;
}
Student4(int student_id){
this();
this.student_id=student_id;
}
Student4(int student_id,String name){
this(student_id);
this.name=name;
}
Student4(int student_id,String name,int age){
this(student_id,name);
this.age=age;

}
Student4(int student_id,String name,int age,double percentage){
this(student_id,name,age);
this.percentage=percentage;
}
public static void main(String[] args){
Student4 s1=new Student4(1,"shahanaj",22,81.84);
s1.display_Attributes();
     s1.edit_name("ameer");
}
}