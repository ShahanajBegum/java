public class MainS6{
public static void Static(){
System.out.println("static");
}

 static void demo(){
System.out.println("Static demo");
}

public static void main(String[]args){
Static();
demo();
MainS6.Static();
MainS6.demo();
MainS6 d=new MainS6();
d.Static();
d.demo();
}

}