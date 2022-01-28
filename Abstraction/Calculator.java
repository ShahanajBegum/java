public abstract class Calculator{
 abstract public int add(int a,int b);


}
class User extends Calculator{
public int add(int a,int b){
return a*b;
}
public static void main(String[] args){
Calculator u =new User();
u.add(5,5);
System.out.println(u.add(5,5));

}

}