public class Convertion{
public static void main(String[] args){
String name="rama";
String n=new String("rama");
StringBuffer b=new StringBuffer(n);
System.out.println(b);
StringBuilder s=new StringBuilder(b);
System.out.println(s);
String a=new String(b);//b
System.out.println(a);
String c=new String(b);
System.out.println(c);

}


}