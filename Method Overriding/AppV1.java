public class AppV1{
public void feature1(){
System.out.println("oldest");
}
}
class AppV2 extends AppV1{
public void feature1(){
System.out.println("updated version");
}
public void feature2(){
System.out.println("new feature added");
}
public static void main(String[] args){
AppV1 v=new AppV2();
v.feature1();
}

}



/