//see Stringpalindrome2
import java.lang.StringBuffer;
class StringPalindrome1
{
public static void main(String[] args){

StringBuffer sb1;
sb1=new StringBuffer("DAD");
StringBuffer reverse=new StringBuffer();
//int length=sb1.length();
for(int i=sb1.length()-1;i>=0;i--){
reverse.append(sb1.charAt(i));
}

if(rev==sb1)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}


}