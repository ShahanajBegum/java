import java.lang.StringBuffer;
class StringPalindrome2
{
public static void main(String[] args){
String ss="ROOR";
StringBuffer sb1=new StringBuffer(ss);
StringBuffer reverse=new StringBuffer();
for(int i=sb1.length()-1;i>=0;i--){
reverse.append(sb1.charAt(i));
}
String rev=new String(reverse);
if(rev.equals(rev))
System.out.println("palindrome");
else
System.out.println("not palindrome");
}


}