public class Over{
int a=1;
static int b=2;
public static void add(){
System.out.println("staticadd");
}

public  void add(){
System.out.println("nonstaticadd");
}
public static void main(String[] args){
Over a=new Over();
a.add();
}

} 