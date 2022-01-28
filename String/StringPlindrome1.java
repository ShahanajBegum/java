import java.lang.StringBuffer;
class StringPalindrome1
{
public static void main(String[] args){
StringBuffer sb1;
sb1=new StringBuffer("DAD");
int length=sb1.length();
for(int i=length-1;i>=0;i++){
rev=rev+sb1.charAt(i);

}
if(rev==sb1)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}


}