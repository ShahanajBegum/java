public class Student1{
int sid;
String sname;
int sclass;
Student1(){
}
Student1(int sid,String sname){
this.sid=sid;
this.sname=sname;
}
Student1(int sid){
this.sid=sid;
}
Student1(int sid,String sname,int sclass){
this.sid=sid;
this.sname=sname;
this.sclass=sclass;
}
public static void main(String[] args){
Student1 s=new Student1();
s.sid=1;
s.sname="shahanaj";
s.sclass=10;
Student1 s2=new Student1(1,"paramesh");
Student1 s3=new Student1(2);
Student1 s4=new Student1(10,"bhavya",4);
System.out.println(s.sid +""+   s.sname+""+ s.sclass);
System.out.println(s2.sid+""+  s2.sname);
System.out.println(s3.sid);
System.out.println(s4.sclass+""+  s4.sname+""+  s4.sid);
}}