public class Branch{
private String manager_name;
private String ifsc;
public void createAccount() {
String name="D.shahanaj";
Long ph=9603494394l;
String address="hn0 5,anantapur";
String fatherName="hajivali";
}
public void branchAttribute(){
this.manager_name=manager_name;
this.ifsc=ifsc;
System.out.println(manager_name);
System.out.println(ifsc);
}
public void setManagername(String manager_name){
this.manager_name=manager_name;
}
public String getManagerName(){
return manager_name;
}
public String getIfsc(){
return ifsc;
}
}