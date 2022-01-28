import java.lang.StringBuffer;
class StringBuffer1
{
public static void main(String[] args){
StringBuffer sb1,sb2;
sb1=new StringBuffer("HELLO");
sb2=new StringBuffer("HELLO");
System.out.println(sb1);
System.out.println(sb2);
System.out.println(sb1==sb2);
System.out.println(sb1.equals(sb2));
}


}