public class StringBuffer{
public static void main(String[] args){
StringBuffer sb1,sb2;
sb1=new StringBuffer("hello");
sb2=new StringBuffer("hello");
System.out.println(sb1);
System.out.println(sb2);
System.out.println(sb1==sb2);
System.out.println(sb1.equals(sb2));
}


}