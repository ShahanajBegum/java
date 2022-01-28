public class PrimeNumberRange{
public static void main(String[] args){
int n=50;
for(int i=20;i<=n;i++){
boolean b=true;
for(int j=2;j<i;j++){
if(i%j==0){
b=false;
break;
}
}
if(b==true)
System.out.println(i +"is a  prime number");
}
}
}
