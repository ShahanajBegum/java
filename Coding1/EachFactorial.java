public class EachFactorial{
public static void main(String[] args){
int n=145;
while(n>0){
int r=n%10;
int f=1;
while(r>1){
f=f*r;
r--;
//System.out.println(f);
}
System.out.println(f);
n=n/10;
}
//System.out.println(f);
}

}