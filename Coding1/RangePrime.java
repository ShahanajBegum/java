public class RangePrime{
public static void main(String[] args){
for(int n=10;n<=20;n++){
boolean b=false;
for(int i=2;i<n;i++){
if(n%i==0)
b=true;
}
if(b==false){
System.out.println(n);
}

}


}
}