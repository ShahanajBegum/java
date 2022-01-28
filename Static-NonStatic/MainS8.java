public class MainS8{
public static void main(String[]args){
Static();                       //cte
demo();                         //cte
MainS7.Static();
MainS7.demo();
MainS7 d=new MainS7();
d.Static();
d.demo();
System.out.println(MainS8.demo());// the return type is void,doesnt return anything so we get cte//
System.out.println(d.demo());//the return type is void, doesnt return anything so we get cte//
}

}